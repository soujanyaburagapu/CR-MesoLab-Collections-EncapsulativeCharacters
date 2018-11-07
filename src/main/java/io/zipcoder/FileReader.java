package io.zipcoder;

import java.io.BufferedReader;
import java.io.File;
import java.lang.String;

public class FileReader
{
    public static void main(String[] args)throws Exception
    {
        String filePath = FileReader.class.getResource("./../../FileToRead.txt").getPath();
        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
