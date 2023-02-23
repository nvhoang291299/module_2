package SS6_inheritance.exam.shape_triangle;

public class MuvablePointController {
    public static void main(String[] args) {
        MuvablePoint point1 = new MuvablePoint();
        MuvablePoint point2 = new MuvablePoint(2,3,2,3);
        MuvablePoint point3 = new MuvablePoint();

        point1.setSpeed(5,5);
        point3.setXSpeed(4);
        point3.setYSpeed(4);
        point3.setPointX(10);
        point3.setPointY(10);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());
    }

}
