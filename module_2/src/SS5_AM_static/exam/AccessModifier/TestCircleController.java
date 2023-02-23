package SS5_AM_static.exam.AccessModifier;

public class TestCircleController{
    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        System.out.print("Test radius: " + circle.getRadius() + "\n");
        System.out.print("Test area: " + circle.getArea());
        TestCircle circle1 = new TestCircle();
        circle1.getRadius();
        System.out.print("Test radius: " + circle.getRadius() + "\n");
        System.out.print("Test area: " + circle.getArea());
    }
}
