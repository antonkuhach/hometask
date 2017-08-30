package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/30/2017.
 */
public class SumCalculatorTest {
    Calculator calculator;

    @BeforeClass
    public void beforeSumCalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    public void SumTest_DoubleOverflow(){
        double actual;
        double expected;

        expected = -1E-323;
        assertEquals(expected, calculator.sum(-3.142E-320, 3.141E-320), 0.0);
    }
}
