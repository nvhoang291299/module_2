package SS10_stack_and_queue.checkBracket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> bStack = new Stack<>();
//        System.out.println("Please enter your expression.");
//        String str = sc.nextLine();
        String str = "– b + b^2 – 4*a*c)^0.5/ 2*a))";
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(String.valueOf(str.charAt(i)));
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("(")){
                bStack.push(arrayList.get(i));
            }
            if(arrayList.get(i).equals(")")){
                if (bStack.isEmpty()) {
                    System.out.println(false);
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
