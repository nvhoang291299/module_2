package SS7_astract_class.exam.colorable;

import SS7_astract_class.exam.shapes.Circle;
import SS7_astract_class.exam.shapes.Rectangle;
import SS7_astract_class.exam.shapes.Shape;
import SS7_astract_class.exam.shapes.Square;

public class ColorableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Square(20);
        shapes[2] = new Rectangle(40,30);
        double random = Math.floor(Math.random() * 100);
        for (Shape shape:shapes) {
            if (shape instanceof Circle){
                System.out.println("Diện tích hình tròn:");
                System.out.println(shape.getArea());
            } else if (shape instanceof Square) {
                System.out.println("Diện tích hình vuông:");
                System.out.println(shape.getArea());
            } else {
                System.out.println("Diện tích hình chữ nhật:");
                System.out.println(shape.getArea());
            }
        }
    }
}
