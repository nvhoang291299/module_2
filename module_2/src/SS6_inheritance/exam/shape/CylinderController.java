package SS6_inheritance.exam.shape;

public class CylinderController {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10,"white", 30);
        Cylinder cylinder2 = new Cylinder();
        cylinder2.setRadius(15.5);
        cylinder2.setColor("yellow");
        cylinder2.setHeight(32);

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());

    }

}
