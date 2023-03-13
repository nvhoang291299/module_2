package Casestudy.common;

import Casestudy.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Employee> read(String path){
        List<Employee> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String temp = "";
            Employee employee;
            String[] tempArr;
            while((temp = br.readLine()) != null){
                tempArr = temp.split(",");
                employee = new Employee(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2], tempArr[3], Integer.parseInt(tempArr[4]),
                        Integer.parseInt(tempArr[5]), tempArr[6], tempArr[7], tempArr[8], Integer.parseInt(tempArr[9]));
                list.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
