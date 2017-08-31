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
    private Calculator calculator;
    private Object expected;
    private Object a;
    private Object b;


    @Before
    public void setup() {
        calculator = new Calculator();
        a = -3.142E-320;
        b = "3.143E-320";
        expected = 1.5E-323;
    }

    @Test
    public void DoubleSumTest(){
        double actual;

        actual = calculator.sum(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
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
