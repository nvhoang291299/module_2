package SS15_IO_textfile.exam.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;

        try {
            line = "";
            FileReader reader = new FileReader("src/SS15_IO_textfile/exam/readFile/country.csv");
            br = new BufferedReader(reader);
            while ((line = br.readLine()) != null) {
                displayCountry((List<String>) changeFile(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static Object changeFile (String line){
        List<String> list = new ArrayList<>();
        if (line != null) {
            String[] arr = line.split(",");
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
        }
        return list;
    }
    private static void displayCountry(List<String> country) {
        System.out.println(country.toString());
    }
}
