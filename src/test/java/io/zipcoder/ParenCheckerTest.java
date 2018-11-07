package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest
{
    ParenChecker checker = new ParenChecker();

    @Test
    public void testOneParenthesis(){
        String value = "(zipcode)";

        Assert.assertTrue(checker.isValid(value));
    }

    @Test
    public void testParenthesis_withoutClosing(){
        String value = "(zipcode";

        Assert.assertFalse(checker.isValid(value));
    }

    @Test
    public void testParenthesis_withoutOpening(){
        String value = "zipcode)";

        Assert.assertFalse(checker.isValid(value));
    }

    @Test
    public void testTwoParenthesis(){
        String value = "(zip()code)";

        Assert.assertTrue(checker.isValid(value));
    }

    @Test
    public void testIsPaired(){
        String value = "(zipcode)";

        Assert.assertTrue(checker.checkIfPaired(value));
    }

    @Test
    public void testIsPaired_withoutClosing(){
        String value = "[zipcode";

        Assert.assertFalse(checker.checkIfPaired(value));
    }

    @Test
    public void testIsPaired_withTwoSets(){
        String value = "<zip<c>ode>";

        Assert.assertTrue(checker.checkIfPaired(value));
    }

    @Test
    public void testIsPaired_withoutOpening(){
        String value = "zipcode}";

        Assert.assertFalse(checker.checkIfPaired(value));
    }

    @Test
    public void testIsPaired_withQuotations(){
        String value = "zip\"code";

        Assert.assertFalse(checker.checkIfPaired(value));
    }
}
