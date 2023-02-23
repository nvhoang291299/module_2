package SS6_inheritance.exam.moveable_point;

import SS6_inheritance.exam.moveable_point.MuvablePoint;

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

        Point coordinates1 = new Point();
        Point coordinates2 = new Point(2, 3);
        Point coordinates3 = new Point();

        coordinates1.setPointX(10);
        coordinates1.setPointY(10);
        coordinates3.setXY(20, 20);
        System.out.println("điểm A có tọa độ: " + coordinates1);
        System.out.println("điểm B có tọa độ: " + coordinates2);
        System.out.println("điểm C có tọa độ: " + coordinates3);

    }

}
