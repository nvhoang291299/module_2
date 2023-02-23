package algorithm;

public class Ex {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= (5-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if(j == 1 || j == 2*i-1) {
                    System.out.print(i+ " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for(int i = 5; i >= 1; --i) {
            for(int j = 1; j <= 5 - i; ++j) {
                System.out.print("  ");
            }
            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print(i + " ");
            }
            for(int j = 0; j < i - 1; ++j) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
