package SS16_IO_binary_file.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "bút bi", 4000, "thiên long", "mực đen"));
        products.add(new Product(2, "bút bi", 4000, "thiên long", "mực xanh"));
        products.add(new Product(3, "vở", 8000, "hải tiến", "kẻ ngang"));
        products.add(new Product(4, "thước", 5000, "deli", "20cm"));
        writeDataToFile("src/SS16_IO_binary_file/exam/manageProduct/data/data.txt", products);
        List<Product> studentDataFromFile = readDataFromFile("src/SS16_IO_binary_file/exam/manageProduct/data/data.txt");
        for (Product product : studentDataFromFile){
            System.out.println(product);
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
