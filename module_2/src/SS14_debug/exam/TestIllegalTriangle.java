package SS14_debug.exam;

import java.util.Scanner;

public class TestIllegalTriangle {
    public static void triangle(double edge1, double edge2, double edge3) throws IllegalTriangleException{
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0){
            throw new IllegalTriangleException("input error");
        }
        else if (edge1 + edge2 <= edge3 || edge3 + edge2 <= edge1 || edge1 + edge3 <= edge2) {
            throw new IllegalTriangleException("arithmetic error");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập cạnh a: ");
            double edge1 = Double.parseDouble(sc.nextLine());
            System.out.println("nhập cạnh b: ");
            double edge2 = Double.parseDouble(sc.nextLine());
            System.out.println("nhập cạnh c: ");
            double edge3 = Double.parseDouble(sc.nextLine());
            triangle(edge1, edge2, edge3);
        } catch (Exception e){
            System.out.println("Error is : " + e.getMessage());
        }
    }
}
