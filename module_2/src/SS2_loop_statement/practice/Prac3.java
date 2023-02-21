package SS2_loop_statement.practice;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = input.nextInt();
        System.out.println("Nhập b: ");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không phải là UCLN");
        }

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("UCLN là: " + a);
    }
}
