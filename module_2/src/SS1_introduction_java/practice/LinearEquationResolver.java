package SS1_introduction_java.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị a:");
        int a = sc.nextInt();
        System.out.println("nhập giá trị b:");
        int b = sc.nextInt();
        System.out.println("nhập giá trị c:");
        int c = sc.nextInt();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Giá trị x là: " + x);
        } else {
            if (b == c) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}
