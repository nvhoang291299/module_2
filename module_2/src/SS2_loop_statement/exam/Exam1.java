package SS2_loop_statement.exam;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn hãy nhập hình mà bạn muốn: ");
        byte number = sc.nextByte();
        switch (number) {
            case 1:
                System.out.println("nhập chiều cao: ");
                int height = sc.nextInt();
                System.out.println("nhập chiều rộng: ");
                int width = sc.nextInt();

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Nhập chiều cao của tam giác vuông:");
                int h = sc.nextInt();

                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Nhập chiều cao của tam giác cân:");
                int hit = sc.nextInt();

                for (int i = 1; i <= hit; i++) {
                    for (int j = 1; j <= (hit-i); j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= (2*i-1); j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Số bạn vừa nhập không có trong menu");
        }



    }
}
