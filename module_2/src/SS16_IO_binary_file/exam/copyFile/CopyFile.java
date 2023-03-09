package SS16_IO_binary_file.exam.copyFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        InputStream inFile = null;
        OutputStream outFile = null;
        try {
            inFile = new FileInputStream(new File("src/SS16_IO_binary_file/exam/copyFile/source.csv"));
            outFile = new FileOutputStream(new File("src/SS16_IO_binary_file/exam/copyFile/target.csv"));
            int length;
            byte[] buffer = new byte[1024];

            while ((length = inFile.read(buffer)) > 0) {
                outFile.write(buffer, 0, length);
                System.out.println("số byte trong tệp: " + length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inFile.close();
                outFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
