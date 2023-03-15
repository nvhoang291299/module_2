package Casestudy.common;

import Casestudy.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fd.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
}
