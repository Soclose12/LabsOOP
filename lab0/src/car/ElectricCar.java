package car;

public class ElectricCar extends Car{
    public int batteryCapacity;
    public int mileage;
    public ElectricCar(int id,String model,int year,double price,String registrationNumber){
        super(id, model, year, price, registrationNumber);
        this.batteryCapacity= batteryCapacity;
        this.mileage=mileage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", mileage=" + mileage +
                '}';
    }
}
