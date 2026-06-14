package p4;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Porsche",245);
        Car c = new Car("Porsche", 245, 69);
        c.accelerate(69);
        System.out.println(c.getCurrentSpeed()+ " " + c.getMaxSpeed() + " " + c.getBrand());
        Bike b = new Bike("ROSE", /*max speed is just human leg power limit*/ 45, true);
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = c;
        vehicles[1] = b;
        b.accelerate(24);
        System.out.println(c);
        System.out.println(b);
        b.ringBell();
    }

}
