package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
@Test(groups = "long")
public class LongDivCalculatorTest {
    public Calculator calculator;

    @BeforeGroups("long")
    public void setup() {
        calculator = new Calculator();
    }

    @Test(groups = "long", dataProvider = "longDivDataProvider")
    public void longDivTest(Object a, Object b, Object expected) {
        long actual;

        actual = calculator.div(Long.parseLong(a.toString()), Long.parseLong(b.toString()));
        assertEquals(Long.parseLong(expected.toString()), actual);
    }

    @AfterGroups("long")
    public void teardown() {
        calculator = null;
    }

    @DataProvider(name = "longDivDataProvider")
    public Object[][] longDivDataProvider() {
        return new Object[][] {
                {28L, 7L, "4"},
                {"0", 67L, "0"},
                {50L, "100", "0"}
        };
    }
}
