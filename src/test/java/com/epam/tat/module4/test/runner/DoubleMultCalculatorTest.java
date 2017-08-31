package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
public class DoubleMultCalculatorTest {
    private Calculator calculator;

    @BeforeTest
    public void setup() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "doubleMultDataProvider")
    public void DoubleMultTest(Object a, Object b, Object expected) {
        double actual;

        actual = calculator.mult(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
        assertEquals(Double.parseDouble(expected.toString()), actual);
    }

    @DataProvider(name = "doubleMultDataProvider")
    public Object[][] doubleMultDataProvider() {
        return new Object[][] {
                {4.0, 7.0, "28"},
                {"0", 67.7, "0.0"},
                {50.0, "100", "5000"}
        };
    }
}
