package SS4_class_and_object.exam.quadractic_equation;

public class QuadraticEquation {
    double numA,numB,numC;

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }
    public double getDiscriminant() {
        double delta = (Math.pow(numB, 2))-4*numA*numC;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-numB+Math.sqrt(getDiscriminant()))/(2*numA);
        return root1;
    }
    public double getRoot2() {
        double root2 = (-numB-Math.sqrt(getDiscriminant()))/(2*numA);
        return root2;
    }
}
