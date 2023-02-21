package SS4_class_and_object.exam.quadractic_equation;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        double delta = (b*b)-4*a*c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b+Math.sqrt(getDiscriminant()))/(2*a);
        return r1;
    }
    public double getRoot2() {
        double r2;
        return r2 = (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
}
