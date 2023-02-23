package SS6_inheritance.exam.point;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float pointZ = 0.0f;
    public Point3D() {}
    public Point3D(float pointX, float pointY, float pointZ) {
        super(pointX, pointY);
        this.pointZ = pointZ;
    }

    public float getPointZ() {
        return pointZ;
    }

    public void setPointZ(float pointZ) {
        this.pointZ = pointZ;
    }
    public void setXYZ(float pointX, float pointY, float pointZ){
        this.setPointX(pointX);
        this.setPointY(pointY);
        this.pointZ = pointZ;
    }
    public String getXYZ(){
        float[] arr = {super.getPointX(), super.getPointY(), getPointZ()};
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return getXYZ();
    }
}
