package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private WebDriver driver;
    private final static String BASE_URL = "http://kubecko.github.io";
    private Random generator;

    @Before
    public void initTests(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }
    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath(".//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                            .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                            Select select = new Select(selectElement);
                    select.selectByIndex(2);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
//        try {
//            driver.get("http://www.trello.com");
//        } catch (UnhandledAlertException e){
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//        }
        driver.switchTo().alert().accept();
    }

    private boolean checkTaskExistInTrello(String taskName) throws InterruptedException{
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("marcinkubecko");
        driverTrello.findElement(By.id("password")).sendKeys("hibernatus858");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Tablica bez nazwy\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(5000);

        result = driverTrello.findElements(By.xpath("//span[@class=\"list-card-title js-card-name\"]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException{
        final String XPATH_FORMS =
                "//form[@class= \"datatable__row\"]";
        final String XPATH_VALUE_TASK = ".//p[@class= \"datatable__field-value\"]";
        final String XPATH_DELETE = ".//div[@class= \"datatable__row-section-wrapper\"]//button[4]";

        driver.findElements(By.xpath(XPATH_FORMS)).stream()
            .filter(taskValue -> taskValue.findElement(By.xpath(XPATH_VALUE_TASK)).getText().equals(taskName))
                .forEach(deleteTask -> {
                    WebElement buttonDelete = deleteTask.findElement(By.xpath(XPATH_DELETE));
                    buttonDelete.click();
                        });

        Thread.sleep(2000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTaskFromCrudApp(taskName);
        assertTrue(checkTaskExistInTrello(taskName));
    }
}
