package SS13_algorithm_sort.practice.java;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ lớn của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        double[] list = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập từng phần tử vào mảng: ");
            double element = Double.parseDouble(sc.nextLine());
            list[i] = element;
        }
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
