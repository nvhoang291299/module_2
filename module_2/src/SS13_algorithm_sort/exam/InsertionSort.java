package SS13_algorithm_sort.exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int valueCurrent;
        int positionIndex;
        for(int i = 1; i < array.length; i++){
            valueCurrent = array[i];
            positionIndex = i;
            while(positionIndex > 0 && valueCurrent < array[positionIndex-1]){
                System.out.println("đổi "+array[positionIndex-1]+ " cho "+array[positionIndex]);
                array[positionIndex] = array[positionIndex-1];
                positionIndex--;
            }
            array[positionIndex] = valueCurrent;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("nhập độ lớn của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử vào mảng ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        insertionSort(array);
        System.out.print("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}
