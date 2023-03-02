package SS10_stack_and_queue.reverseElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();
        String[] mWord = new String[str.length()];
        for (int i = 0; i < str.length() ; i++) {
            wStack.push(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mWord));
    }
}
