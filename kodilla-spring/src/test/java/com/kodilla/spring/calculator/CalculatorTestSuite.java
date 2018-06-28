package com.kodilla.spring.calculator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2,3);
        calculator.div(6,2);
        calculator.mul(2,2);
        calculator.sub(10, 4);
        //Then
            //do nothing
    }
}
