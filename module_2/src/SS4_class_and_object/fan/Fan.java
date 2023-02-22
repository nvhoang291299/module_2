package SS4_class_and_object.fan;

public class Fan {
    final byte SLOW = 1, MEDIUM = 2, HIGH = 3;
    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";
    private boolean on = false;

    public Fan() {
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean getOn(){
        return on;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        String str = "Quạt đang chạy với tốc độ " + getSpeed() +
                ", có màu "+ getColor() +", có bán kính là " + getRadius();
        if (getOn()){
            return str + " fan is on";
        } else {
            return " fan is off";
        }
    }
}
