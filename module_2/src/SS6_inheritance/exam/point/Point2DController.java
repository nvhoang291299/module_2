package SS6_inheritance.exam.point;

public class Point2DController {
    public static void main(String[] args) {
        Point2D coordinates1 = new Point2D();
        Point2D coordinates2 = new Point2D(2,3);
        Point2D coordinates3 = new Point2D();

        coordinates1.setPointX(10);
        coordinates1.setPointY(10);
        coordinates3.setXY(20,20);
        System.out.println("điểm A có tọa độ: "+coordinates1);
        System.out.println("điểm B có tọa độ: "+coordinates2);
        System.out.println("điểm C có tọa độ: "+coordinates3);
    }
}
