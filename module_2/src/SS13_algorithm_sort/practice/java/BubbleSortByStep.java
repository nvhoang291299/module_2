package SS13_algorithm_sort.practice.java;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Đổi " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng có thể được sắp xếp");
                break;
            }
            System.out.print("Mảng sau khi đươc " + k + "' sắp xếp: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = Integer.parseInt(sc.nextLine());
        int[] list = new int[size];
        System.out.println("nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("mảng: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
}
