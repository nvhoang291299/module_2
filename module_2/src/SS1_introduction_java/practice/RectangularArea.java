package SS1_introduction_java.practice;

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        float width = sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        float height = sc.nextFloat();
        System.out.println("Diện tích hình chữ nhật: " + height*width);
    }
}
