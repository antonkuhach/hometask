package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/30/2017.
 */
public class DoubleSumCalculatorTest {
    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void SumTest(){
        double expected;
        double actual;

        expected = 1.5E-323;
        actual = calculator.sum(-3.142E-320, 3.143E-320);
        assertEquals(expected, actual, 0.000001);
    }

    @After
    public void teardown() {
        calculator = null;
    }
}
