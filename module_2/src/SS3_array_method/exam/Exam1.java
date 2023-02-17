package SS3_array_method.exam;

import java.util.Arrays;
import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,3,7,8,9};
        System.out.println("nhập phần tử can xóa:");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                for (int j = i; j < (arr.length-1); j++) {
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
