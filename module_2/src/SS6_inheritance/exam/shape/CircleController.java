package SS6_inheritance.exam.shape;

public class CircleController {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.5,"black");
        Circle circle2 = new Circle();

        circle2.setRadius(5.5);
        circle2.setColor("green");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
