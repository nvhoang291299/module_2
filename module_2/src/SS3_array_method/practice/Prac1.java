package SS3_array_method.practice;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a size:");
            n = scanner.nextInt();
            if (n > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (n > 20);
        int[] array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử trong mảng " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[n - 1 - j];
            array[n - 1 - j] = temp;
        }
        System.out.println("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
