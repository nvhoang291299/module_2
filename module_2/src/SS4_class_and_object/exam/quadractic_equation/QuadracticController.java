package SS4_class_and_object.exam.quadractic_equation;

import java.util.Scanner;

public class QuadracticController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double numA = scanner.nextDouble();
        System.out.print("Enter b:");
        double numB = scanner.nextDouble();
        System.out.print("Enter c:");
        double numC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numA, numB, numC);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phuong trình có 2 nghiệm là: "
                    + quadraticEquation.getRoot1()
                    +", "+ quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm là: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
