package SS1_introduction_java.practice;

import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn (kg): ");
        float w = sc.nextFloat();
        System.out.println("Nhập chiều cao của bạn (m): ");
        float h = sc.nextFloat();
        double bmi = w / Math.pow(h, 2);

        if (bmi < 18) {
            System.out.println("Underweight");
        }
        else if (bmi < 25.0) {
            System.out.println("Normal");
        }
        else if (bmi < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
