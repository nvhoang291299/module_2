package SS6_inheritance.exam.point;

public class Point3DController {
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


        Point3D coordinates4 = new Point3D();
        Point3D coordinates5 = new Point3D(2,3,4);
        Point3D coordinates6 = new Point3D();

        coordinates4.setPointX(10);
        coordinates4.setPointY(10);
        coordinates4.setPointZ(10);
        coordinates6.setXYZ(30,30,30);
        System.out.println("điểm A có tọa độ: "+coordinates4);
        System.out.println("điểm B có tọa độ: "+coordinates5);
        System.out.println("điểm C có tọa độ: "+coordinates6);
    }
}
