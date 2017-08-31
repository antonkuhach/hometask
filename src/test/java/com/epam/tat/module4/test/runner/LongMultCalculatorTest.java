package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
@Test(groups = "long")
public class LongMultCalculatorTest {
    private Calculator calculator;

    @BeforeGroups("long")
    public void setup() {
        calculator = new Calculator();
        }

    @Test(groups = "long")
    @Parameters({"a", "b", "expected"})
    public void LongMultTest(String a, String b, String expected) {
        long actual;

        actual = calculator.mult(Long.parseLong(a), Long.parseLong(b));
        assertEquals(Long.parseLong(expected), actual);
    }

    @AfterGroups("long")
    public void teardown() {
        calculator = null;
    }
}
