package com.multi.collection.thisisjava.ch15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Run {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("src/com/multi/collection/b_detail/properties/db.properties"));

        Set<Map.Entry<Object, Object>> entrySet = prop.entrySet();
        for(Map.Entry<Object,Object> e : entrySet) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
