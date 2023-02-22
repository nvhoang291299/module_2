package SS5_AM_static.exam.AccessModifier;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
    void Circle() {}
    double Circle(double radius){
        return radius;
    }

      double getRadius() {
        return radius;
    }
     public double getArea() {
        double area = Math.pow(radius,2)*Math.PI;
        return area;
    }
}
