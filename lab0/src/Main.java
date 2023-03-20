import car.Car;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car[] cars = createCars();

        String model = "Toyota";
        Car[] carsByModel = getCarsByModel(cars, model);
        System.out.println("Список автомобілів моделі " + model + ":");
        printCarsArray(carsByModel);

        int yearsInUse = 3;
        Car[] carsByModelAndYears = getCarsByModelAndYears(cars, model, yearsInUse);
        System.out.println("Список автомобілів моделі " + model + ", які експлуатуються більше " + yearsInUse + " років:");
        printCarsArray(carsByModelAndYears);

        int year =2015;
        int price= 5000;
        Car[] carsByPricelAndYears = getCarsByYearAndPrice(cars, year, price);
        System.out.println("Список автомобілів року випуску " + year + ", ціна яких більше " + price + ":");
        printCarsArray(carsByPricelAndYears);

    }
    public static Car[] createCars() {
        Car[] cars = new Car[5];
        cars[0] = new Car(1, "Toyota", 2010, 7000, "BO4444АХ");
        cars[1] = new Car(2, "Mercedes-Benz", 2015, 7000, "BO1111АХ");
        cars[2] = new Car(3, "BMW", 2010, 8000, "BO3333АХ");
        cars[3] = new Car(4, "Toyota", 2013, 9000, "BO5555АХ");
        cars[4] = new Car(5, "Volkswagen", 2010, 6000, "BO7777АХ");
        return cars;
    }
    public static void printCarsArray(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
    public static Car[] getCarsByModel(Car[] cars, String model) {
        Car[] result = new Car[0];
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = car;
            }
        }
        return result;
    }
    public static Car[] getCarsByModelAndYears(Car[] cars, String model, int n) {
        Car[] result = new Car[0];
        for (Car car : cars) {
            if (car.getModel().equals(model) && (2023 - car.getYear()) > n) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = car;
            }
        }
        return result;
    }
    public static Car[] getCarsByYearAndPrice(Car[] cars, int year, double minPrice) {
        Car[] result = new Car[0];
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > minPrice) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = car;
            }
        }
        return result;

        }

    }
