package SS7_astract_class.exam.shapes;

import SS7_astract_class.exam.resizeable.IResizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public void resize(double percent) {
        double width1 = percent/100;
        double height1 = percent/100;
        setWidth(width += width1);
        setHeight(height += height1);
    }
}
