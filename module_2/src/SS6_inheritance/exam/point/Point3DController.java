package SS6_inheritance.exam.point;

public class Point3DController {
    public static void main(String[] args) {
        Point3D coordinates1 = new Point3D();
        Point3D coordinates2 = new Point3D(2,3,4);
        Point3D coordinates3 = new Point3D();

        coordinates1.setPointX(10);
        coordinates1.setPointY(10);
        coordinates1.setPointZ(10);
        coordinates3.setXYZ(30,30,30);
        System.out.println("điểm A có tọa độ: "+coordinates1);
        System.out.println("điểm B có tọa độ: "+coordinates2);
        System.out.println("điểm C có tọa độ: "+coordinates3);
    }
}
