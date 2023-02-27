package SS6_inheritance.exam.moveable_point;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint() {}
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed, float pointX, float pointY){
        this.setPointX(pointX);
        this.setPointY(pointY);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public String getSpeed(){
        float[] arr = {getXSpeed(), getYSpeed()};
        return Arrays.toString(arr);
    }
    @Override
    public String toString() {
        return "MuvablePoint {" +
                "x=" + super.getPointX() +
                ", y=" + super.getPointY() +
                ", speed = "+ getSpeed() +
                '}';
    }
    public MovablePoint move() {
        setXY(xSpeed+getPointX(),ySpeed+getPointY());
        return this;
    }
}
