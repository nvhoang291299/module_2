package SS5_AM_static.practice.static_property;

public class Car {
    private static String name;
    private String color;
    public static int numberOfCars;
    public Car(String name, String color){
        this.name = name;
        this.color = color;
        numberOfCars++;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }
}
