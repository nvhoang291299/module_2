package Casestudy.common;

import Casestudy.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void write(String path, String string){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.newLine();
            bw.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
