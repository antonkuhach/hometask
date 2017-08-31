package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
public class LongSubCalculatorTest {
    private Calculator calculator;
    private Object expected;
    private Object a;
    private Object b;

    @Before
    public void setup() {
        calculator = new Calculator();
        a = -80L;
        b = "40";
        expected = "-120";
    }

    @Test
    public void LongSubTest() {
        long actual;

        actual = calculator.sub(Long.parseLong(a.toString()), Long.parseLong(b.toString()));
        assertEquals(Long.parseLong(expected.toString()), actual, 0.000001);
    }

    @After
    public void teardown() {
        calculator = null;
        a = null;
        b = null;
        expected = null;
    }
}
