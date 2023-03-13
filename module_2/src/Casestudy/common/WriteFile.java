package Casestudy.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void write(String path){
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(path,true));
//            bw.write();
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
