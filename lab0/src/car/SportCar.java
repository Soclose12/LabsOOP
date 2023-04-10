package car;

public class SportCar extends Car{

    public int maxSpeed;
    public int dors;
    public SportCar(int id,String model,int year,double price,String registrationNumber){
        super(id, model, year, price, registrationNumber);
        this.maxSpeed= maxSpeed;
        this.dors=dors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", dors=" + dors +
                '}';
    }
}
