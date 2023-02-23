package SS6_inheritance.practice.controllers;

import SS6_inheritance.practice.shape.Rectangle;

public class RectangleController {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 4.7, 8.3);
        System.out.println(rectangle);
    }
}
