package SS3_array_method.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7 {
    static float sumArr2d() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều:");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng 2 chiều:");
        int col = sc.nextInt();
        float[][] arr2d = new float[row][col];
        System.out.println("Nhập các phần tử của mảng:");
        for(int i = 0; i < arr2d.length ; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Mảng có dạng: " + Arrays.deepToString(arr2d));
        float sum = 0.0f;
        for(int i = 0; i < arr2d.length ; i++) {
//            for(int j = 0; j < arr2d[i].length; j++) {
//
//            }
            sum += arr2d[i][i];
        }
        System.out.println("Tổng các pần tử của cột " + sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumArr2d());
    }
}
