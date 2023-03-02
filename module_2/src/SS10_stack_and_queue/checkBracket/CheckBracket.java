package SS10_stack_and_queue.checkBracket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static Boolean isBracket(){
        Scanner sc = new Scanner(System.in);
        Stack<String> bStack = new Stack<>();
        System.out.println("Nhập chuỗi mà bạn muốn kiểm tra:");
        String str = sc.nextLine();
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
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isBracket());
    }
}
