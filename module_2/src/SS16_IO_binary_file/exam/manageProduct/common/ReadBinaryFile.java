package SS16_IO_binary_file.exam.manageProduct.common;

import SS16_IO_binary_file.exam.manageProduct.model.Product;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadBinaryFile {
    public static List<Product> readBinaryFile(String path){
        List<Product> products = new ArrayList<>();
        FileInputStream inFile = null;
        ObjectInputStream inStream = null;
        try {
            inFile = new FileInputStream(path);
            inStream = new ObjectInputStream(inFile);
            products = (List<Product>) inStream.readObject();
            inFile.close();
            inStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
        return products;
    }
}
