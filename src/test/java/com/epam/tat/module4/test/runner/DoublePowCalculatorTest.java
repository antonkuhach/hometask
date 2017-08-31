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
@Test(groups = "double")
public class DoublePowCalculatorTest {
    private Calculator calculator;

    @BeforeGroups("double")
    public void setup() {
        calculator = new Calculator();
    }

    @Test(groups = "double", dataProvider = "doublePowDataProvider")
    public void DoublePowTest(Object a, Object b, Object expected) {
        double actual;

        actual = calculator.pow(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
        assertEquals(Double.parseDouble(expected.toString()), actual);
    }

    @AfterGroups("double")
    public void teardown() {
        calculator = null;
    }

    @DataProvider(name = "doublePowDataProvider")
    public Object[][] doublePowDataProvider() {
        return new Object[][] {
                {4.0, 2.0, "16"},
                {"0", 67.7, "0.0"},
                {5.0, "4", "625"}
        };
    }
}
