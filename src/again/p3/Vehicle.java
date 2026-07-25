package again.p3;

public class Vehicle {
    private String brand = "";


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle v = new Vehicle();
        v.setBrand(brand);
        return v;
    }

    public Vehicle createCopy(){
        Vehicle v = new Vehicle();
        v.setBrand(brand);
        return v;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Vehicle v = (Vehicle) obj;
        return v.getBrand().equals(this.getBrand());
    }
}
