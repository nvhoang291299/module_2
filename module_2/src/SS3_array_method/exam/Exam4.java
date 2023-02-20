package SS3_array_method.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều:");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng 2 chiều:");
        int col = sc.nextInt();
        int[][] arr2d = new int[row][col];
        System.out.println("Mảng có dạng:");
        for(int i = 0; i < arr2d.length ; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr2d));
        int max = arr2d[0][0] ;
        for(int i = 0; i < arr2d.length ; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                if (max < arr2d[i][j]){
                    max = arr2d[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận: " + max);
    }
}
