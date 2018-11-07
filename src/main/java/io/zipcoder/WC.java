package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WC {
    private Iterator<String> si;
    Map<String, Integer> map = new TreeMap<String, Integer>();

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }
    public WC(Iterator<String> si) {
        this.si = si;
    }
    public Map<String, Integer> readFile(){
        while (si.hasNext()) {
            String word = si.next();
            if (map.containsKey(word)) {
                int count = map.get(word)+1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    }


