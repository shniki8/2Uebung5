package again.p3;

public class Car extends Vehicle{
    private int horsePower = 0;

    public Car createCopy(){
        Car c = new Car();
        c.setBrand(getBrand());
        c.setHorsePower(horsePower);
        return c;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Car c = (Car) obj;
        return c.getBrand().equals(this.getBrand()) && c.getHorsePower() == this.getHorsePower();
    }
}
