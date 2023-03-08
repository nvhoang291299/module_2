package SS15_IO_textfile.exam.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = null;

        try {
            FileReader reader = new FileReader("src/SS15_IO_textfile/exam/readFile/country.csv");
            br = new BufferedReader(reader);
            String[] arr = new String[]{br.readLine()};
            System.out.println(Arrays.toString(arr));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
