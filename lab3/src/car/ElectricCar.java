package car;

public class ElectricCar extends Car {
    public int batteryCapacity;
    public int range;

    public ElectricCar(int id, String model, int year, double price, String registrationNumber, int batteryCapacity, int range) {
        super(id, model, year, price, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity(kW h)=" + batteryCapacity +
                ", range(km)=" + range +
                '}';
    }
}