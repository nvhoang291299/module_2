package SS2_loop_statement.practice;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("Nhap so tien gui: ");
        money = input.nextDouble();
        System.out.println("Nhap so thang gui: ");
        month = input.nextInt();
        System.out.println("Nhập lãi suất: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Lãi suất nhận được: " + totalInterest);
    }
}
