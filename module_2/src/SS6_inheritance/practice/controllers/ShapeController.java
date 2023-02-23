package SS6_inheritance.practice.controllers;

import SS6_inheritance.practice.shape.Shape;

public class ShapeController {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red", false);
            System.out.println(shape);
        }
}
