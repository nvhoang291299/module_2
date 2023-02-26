package SS7_astract_class.exam.shapes;

import SS7_astract_class.exam.resizeable.IResizeable;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area =Math.pow(radius,2)*3.14;
        return area;
    }
    @Override
    public void resize(double percent) {
        double radius1;
        radius1 = radius*(percent/100);
        this.radius += radius1;
        this.setRadius(this.radius);
    }
}
