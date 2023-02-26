package SS7_astract_class.exam.shapes;

import SS7_astract_class.exam.colorable.IColorable;
import SS7_astract_class.exam.resizeable.IResizeable;

public class Square extends Shape implements IResizeable, IColorable {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size,2);
    }
    @Override
    public void resize(double percent) {
        double size1;
        size1 = size*(percent/100);
        this.size += size1;
        this.setSize(this.size);
    }

    @Override
    public String howToColor() {
//        System.out.println();
        return "Color all four sides.";
    }
}
