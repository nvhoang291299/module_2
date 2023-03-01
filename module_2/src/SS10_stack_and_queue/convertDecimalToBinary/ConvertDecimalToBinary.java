package SS10_stack_and_queue.convertDecimalToBinary;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Long> stk = new Stack<>();
        long temp;
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.print("Nhập số thập phân: ");
        long number = Long.parseLong(sc.nextLine());
        while (number > 0){
            temp = number % 2;
            stk.push(temp);
            number = number / 2;
        }
        int size = stk.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(String.valueOf(stk.pop()));
        }
        String str = String.join("",arrayList);
        System.out.println("hệ số nhị phân là: " + str);
    }
}

