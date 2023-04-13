import car.Car;
import car.ElectricCar;
import car.SportCar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car(0, "Toyota", 2019, 50000, "BO4321TE");
        cars[1] = new Car(1, "Honda", 2018, 40000, "BO8765TE");
        cars[2] = new SportCar(3, "Porsche", 2021, 150000, "BO1234TE", 2, 300);
        cars[3] = new ElectricCar(4, "Tesla", 2022, 100000, "BO5678TE", 100, 500);

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}