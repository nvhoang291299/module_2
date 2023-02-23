package SS6_inheritance.exam.moveable_point;

import java.util.Arrays;

public class MuvablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MuvablePoint() {}
    public MuvablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MuvablePoint(float xSpeed, float ySpeed, float pointX, float pointY){
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
    public String move() {
        float x = super.getPointX();
        float y = super.getPointY();
        x += this.getXSpeed();
        y += this.getYSpeed();
        float[] arr = {x,y};
        return Arrays.toString(arr);
    }
    @Override
    public String toString() {
        return "MuvablePoint {" +
                "x=" + super.getPointX() +
                ", y=" + super.getPointY() +
                ", speed = "+ getSpeed() +
                ", move = "+ move() +
                '}';
    }

}
