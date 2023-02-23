package SS6_inheritance.exam.shape_triangle;

public class PointController {
    public static void main(String[] args) {
        Point coordinates1 = new Point();
        Point coordinates2 = new Point(2, 3);
        Point coordinates3 = new Point();

        coordinates1.setPointX(10);
        coordinates1.setPointY(10);
        coordinates3.setXY(20, 20);
        System.out.println("điểm A có tọa độ: " + coordinates1);
        System.out.println("điểm B có tọa độ: " + coordinates2);
    }
}
