package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
public class LongMultCalculatorTest {
    private Calculator calculator;

    @BeforeTest
    public void setup() {
        calculator = new Calculator();
        }

    @Test
    @Parameters({"a", "b", "expected"})
    public void LongMultTest(String a, String b, String expected) {
        long actual;

        actual = calculator.mult(Long.parseLong(a), Long.parseLong(b));
        assertEquals(Long.parseLong(expected), actual);
    }

    @AfterTest
    public void teardown() {
        calculator = null;
    }
}
