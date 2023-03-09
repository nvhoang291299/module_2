package SS15_IO_textfile.exam.copyFileText;


import java.io.*;

public class FileText {

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String str = null;
        try {
            FileReader fileReader = new FileReader("src/SS15_IO_textfile/exam/copyFileText/sourceFile.csv");
            FileWriter fileWriter = new FileWriter("src/SS15_IO_textfile/exam/copyFileText/targetFIle.csv",true);
            reader = new BufferedReader(fileReader);
            writer = new BufferedWriter(fileWriter);
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                str = line;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' '){
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("file nguồn không tồn tại");
        } catch (NullPointerException e){
            System.out.println("file rỗng");
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            System.out.println("tổng số ký tự trong chuỗi " + count);
        }
    }
}
