package SS1_introduction_java.practice;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;

        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf(year + " là năm nhuận");
        } else {
            System.out.printf(year + " không phải là năm nhuận");
        }
    }
}
