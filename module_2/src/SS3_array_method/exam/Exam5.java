package SS3_array_method.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam5 {
    static int minArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ lớn của mảng:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng:");
        return min;
    }
    public static void main(String[] args) {
        System.out.println(minArr());
    }
}
