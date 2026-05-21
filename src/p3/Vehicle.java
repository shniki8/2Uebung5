package p3;

public class Vehicle {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Vehicle createCopy(){ //Duplication Glitch.
        Vehicle a = new Vehicle();
        a.setBrand(this.getBrand());
        return a;
    }
    public void showInfo(){
        System.out.println("Brand: " + this.getBrand());
    }
}
