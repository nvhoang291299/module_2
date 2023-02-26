package SS7_astract_class.exam.colorable;

import SS7_astract_class.exam.shapes.Circle;
import SS7_astract_class.exam.shapes.Rectangle;
import SS7_astract_class.exam.shapes.Shape;
import SS7_astract_class.exam.shapes.Square;

import java.sql.SQLOutput;
import java.util.Scanner;
//import SS7_astract_class.exam.shapes.Square1;


public class ColorableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Square(25);
        shapes[2] = new Rectangle(30,40);

        for (Shape shape:shapes) {
            if (shape instanceof IColorable){
                System.out.println(((IColorable) shape).howToColor());
                System.out.println("Diện tích hình thoa man dieu kien:");
                System.out.println(shape.getArea());
            }
        }
    }
}
