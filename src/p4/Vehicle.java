package p4;

public class Vehicle {
    private String brand;
    private int maxSpeed;
    private int currentSpeed;
    public Vehicle(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public void accelerate(int value){
        if (currentSpeed+value <= maxSpeed){
            currentSpeed += value;
        } else if (currentSpeed+value > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }
    public void brake(int value){
        if (currentSpeed-value>=0){
            currentSpeed -= value;
        } else if (currentSpeed-value <0) {
            currentSpeed = 0;
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
