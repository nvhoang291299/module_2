package SS3_array_method.exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ lớn mảng 1:");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("nhập độ lớn mảng 2:");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        int[] arr3 = new int[arr1.length+arr2.length];
        System.out.println(arr3.length);
        for (int i = 0; i < a; i++) {
            System.out.println("nhập phần tử mảng 1:");
            arr1[i] = sc.nextInt();
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            System.out.println("nhập phần tử mảng 2:");
            arr2[i] = sc.nextInt();
            arr3[i+b] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
