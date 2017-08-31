package com.epam.tat.module4.test.runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

/**
 * Created by Anton_Kuhach on 8/31/2017.
 */
@Test(groups = "double")
public class DoubleMultCalculatorTest {
    private Calculator calculator;

    @BeforeGroups("double")
    public void setup() {
        calculator = new Calculator();
    }

    @Test(groups = "double", dataProvider = "doubleMultDataProvider")
    public void DoubleMultTest(Object a, Object b, Object expected) {
        double actual;

        actual = calculator.mult(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
        assertEquals(Double.parseDouble(expected.toString()), actual);
    }

    @AfterGroups("double")
    public void teardown() {
        calculator = null;
    }

    @DataProvider(name = "doubleMultDataProvider")
    public Object[][] doubleMultDataProvider() {
        return new Object[][] {
                {4.0, 7.0, "28"},
                {"0", 67.7, "0.0"},
                {50.0, "100", "5000"}
        };
    }
}
