package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest
{
    @Test
    public void testparenchecker()
    {
        ParenChecker p=new ParenChecker();
        String str="welcome[to] the {Zipcode";
        boolean expected= false;
        boolean actual=p.isBalanced(str) ;
        Assert.assertEquals(expected,actual) ;
    }

    @Test
    public void testparenchecker1()
    {
        ParenChecker p=new ParenChecker();
        String str="welcome[to] the {Zipcode}";
        boolean expected= true;
        boolean actual=p.isBalanced(str) ;
        Assert.assertEquals(expected,actual) ;
    }

}