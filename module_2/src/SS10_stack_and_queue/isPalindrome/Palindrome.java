package SS10_stack_and_queue.isPalindrome;

import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        Queue queue = new LinkedList();
        for (int i = (str.length()-1); i >= 0; i--) {
            queue.add(str.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (str.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
