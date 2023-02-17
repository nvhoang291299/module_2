package SS3_array_method.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] oldArr = {1,2,3,4,5,6,7,8,9};
        System.out.println("nhập độ lớn của mảng mới:");
        int n = sc.nextInt();
        int[] newArr = new int[n];
        System.out.println("nhập phần tử cần thêm vào mảng:");
        int x = sc.nextInt();
        System.out.println("nhập vị trí cần thêm vào mảng:");
        int index = sc.nextInt();

        if (index <= -1 || index >= (oldArr.length-1)){
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < oldArr.length; i++) {
                newArr[i] = oldArr[i];
            }
            for (int j = newArr.length-1; j > 0; j--) {
                newArr[j] = newArr[j-1];
                if (j == index){
                    newArr[j] = x;
                    break;
                }
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}
