package SS6_inheritance.practice.shape;

public class Shape {
     private String color;
     private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled(boolean filled) {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color of "+getColor()+" and "+(isFilled(filled)? "filled":"not filled");
    }
}
