package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WC {
    private Scanner sc;

    public WC(String fileName) {
        try {
            sc = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }
}
