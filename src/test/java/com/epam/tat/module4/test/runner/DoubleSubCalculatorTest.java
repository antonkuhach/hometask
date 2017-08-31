package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
public class DoubleSubCalculatorTest {
    private Calculator calculator;
    private Object expected;
    private Object a;
    private Object b;

    @Before
    public void setup() {
        calculator = new Calculator();
        a = 3.0;
        b = "2.0";
        expected = 1.0;
    }

    @Test
    public void DoubleSubTest() {
        double actual;

        actual = calculator.sub(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
        assertEquals(Double.parseDouble(expected.toString()), actual, 0.000001);
    }

    @After
    public void teardown() {
        calculator = null;
        a = null;
        b = null;
        expected = null;
    }
}
