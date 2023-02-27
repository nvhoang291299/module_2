package SS6_inheritance.exam.moveable_point;

public class MovablePointController {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint();
        MovablePoint point2 = new MovablePoint(2,3,2,3);
        MovablePoint point3 = new MovablePoint();

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
