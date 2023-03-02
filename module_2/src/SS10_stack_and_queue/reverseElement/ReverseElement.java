package SS10_stack_and_queue.reverseElement;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class ReverseElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        System.out.print("Nhập độ dài của mảng mà bạn muốn: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử vào mảng: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = (arr.length-1); i >= 0; i--) {
            stk.push(arr[i]);
        }
        for (int j = (arr.length-1); j >= 0; j--) {
            arr[j] = stk.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
