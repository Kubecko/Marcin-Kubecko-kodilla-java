package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";

    public static final String XPATH_SELECT_DAY =
            "//form[contains(@action, \"https://m.facebook.com/reg/\")]//div[contains(@class, \"_5k_5\")]//span/select[1]";
    public static final String XPATH_SELECT_MONTH =
            "//form[contains(@action, \"https://m.facebook.com/reg/\")]//div[contains(@class, \"_5k_5\")]//span/select[2]";

    public static final String XPATH_SELECT_YEAR =
            "//form[contains(@action, \"https://m.facebook.com/reg/\")]//div[contains(@class, \"_5k_5\")]//span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://facebook.com/");

        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed());
        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed());
        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBirthdayDay = new Select(selectComboDay);
        selectBirthdayDay.selectByIndex(15);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBirthdayMonth = new Select(selectComboMonth);
        selectBirthdayMonth.selectByIndex(12);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBirthdayYear = new Select(selectComboYear);
        selectBirthdayYear.selectByIndex(25);
    }
}
