package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
public class LongSumCalculatorTest {
    private Calculator calculator;
    private Object expected;
    private Object a;
    private Object b;

    @Before
    public void setup() {
        calculator = new Calculator();
        a = 9223372036854775807L;
        b = "1";
        expected = -9223372036854775808L;
    }

    @Test
    public void LongSumTest() {
        long actual;

        actual = calculator.sum(Long.parseLong(a.toString()), Long.parseLong(b.toString()));
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
