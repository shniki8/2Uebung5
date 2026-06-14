package p4;

public class Bike extends Vehicle {
    boolean bell;
    public Bike (String brand, int maxSpeed, boolean bell){
        super(brand,maxSpeed);
        this.bell = bell;
    }
    public void ringBell(){
        if (bell){
            System.out.println("Ring Ring!");
        }
    }

    @Override
    public String toString() {
        return getBrand() + ", " + getMaxSpeed() + ", current: " +getCurrentSpeed() + ", bell: " + bell;
    }
}
