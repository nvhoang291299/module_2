package Casestudy.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> read(String path){
        FileReader fd = null;
        List<String> list = new ArrayList<>();
        String temp = "";
        try {
            fd = new FileReader(path);
            BufferedReader br = new BufferedReader(fd);
            while((temp = br.readLine()) != null){
                list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
