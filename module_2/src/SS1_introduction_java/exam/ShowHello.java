package SS1_introduction_java.exam;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

}
