package SS12_algorithm_search.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] array, int left, int right, int value){
        int middle = (right + left)/2;
        if (right >= left) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập độ lớn của mảng: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("nhập phần tử thứ " + i +" vào mảng: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 0, arr.length-1, 2));
    }
}
