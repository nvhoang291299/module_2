package SS16_IO_binary_file.exam.manageProduct.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private int price;
    private String produce;
    private String description;

    public Product(int id, String nameProduct, int price, String produce, String description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.produce = produce;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descreption) {
        this.description = descreption;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", produce='" + produce + '\'' +
                ", descreption='" + description + '\'' +
                '}';
    }
}
