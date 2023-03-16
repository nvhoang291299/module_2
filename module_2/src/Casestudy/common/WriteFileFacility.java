package Casestudy.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileFacility {
    public static void write(String path, String string){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.write(string);
            bw.newLine();
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
