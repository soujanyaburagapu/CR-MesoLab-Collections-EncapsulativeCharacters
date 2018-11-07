package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.Map;

public class WCTest {
    String filename = "./../../FileToRead.txt";
    String filePath = WC.class.getResource(filename).getFile();

    WC wc = new WC(filePath);

    @Test
    public void testReadFile(){
        Map<String, Integer> map = wc.readFile();

        Integer expectedTestCount = 3;
        Assert.assertEquals(expectedTestCount, map.get("Test"));

        Integer expectedThisCount = 3;
        Assert.assertEquals(expectedThisCount, map.get("this"));

        Integer expectedFileCount = 2;
        Assert.assertEquals(expectedFileCount, map.get("file"));

        Integer expectedAppleCount = 1;
        Assert.assertEquals(expectedAppleCount, map.get("zipcode"));
    }

}