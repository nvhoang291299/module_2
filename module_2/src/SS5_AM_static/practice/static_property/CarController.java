package SS5_AM_static.practice.static_property;

import java.util.Arrays;

public class CarController {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari","Red");
        System.out.println("Hãng xe " + Car.getName());
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Bugatti","Black");
        System.out.println("Hãng xe "+ car2.getName());
        System.out.println(Car.numberOfCars);
    }
}
