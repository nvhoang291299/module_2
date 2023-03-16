package Casestudy.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileFacility {
    public static Map<String, Integer> read(String path) {
        FileReader fr = null;
        Map<String, Integer> list = new LinkedHashMap();
        String temp = "";
        try {
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while((temp = br.readLine()) != null){
                list.put(temp, 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
