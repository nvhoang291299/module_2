package SS3_array_method.exam;

import java.util.Scanner;

public class Exam8 {
    static int countString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi mã bạn muốn: ");
        String str = sc.nextLine();
        System.out.println("Nhập chuỗi mã bạn muốn: ");
        char chr = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + chr + " trong chuỗi là:");
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countString());
    }
}
