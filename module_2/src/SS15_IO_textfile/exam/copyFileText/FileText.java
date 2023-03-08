package SS15_IO_textfile.exam.copyFileText;


import java.io.*;

public class FileText {

    public static void main(String[] args) throws IOException {
        int count = 0;
        String str = null;
        try {
            FileReader file = new FileReader("src/SS15_IO_textfile/exam/copyFileText/sourceFile.csv");
            BufferedReader reader = new BufferedReader(file);
            str = reader.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' '){
                    count++;
                }
            }

            FileWriter writer = new FileWriter("src/SS15_IO_textfile/exam/copyFileText/targetFile.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.write("tổng số ký tự trong chuỗi: " + count);
            bufferedWriter.flush();
        } catch (FileNotFoundException e){
            System.out.println("file nguồn không tồn tại");
        } catch (NullPointerException e){
            System.out.println("file rỗng");
        }


    }
}
