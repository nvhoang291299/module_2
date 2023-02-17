package SS2_loop_statement.exam;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int num = 2;

        while(count < numbers) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
