package SS2_loop_statement.practice;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " không phải là số nguyên to");
        } else {
            boolean flag = true;
            for (int i = 2;i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(number + " là số nguyên tố");
            else
                System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
