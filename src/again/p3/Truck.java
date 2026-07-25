package again.p3;

public class Truck extends Vehicle{
    private double maxLoad; // Huge load ;)

    public Truck createCopy(){
        Truck t = new Truck();
        t.setBrand(getBrand());
        t.setMaxLoad(maxLoad);
        return t;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Truck t = (Truck) obj;
        return t.getBrand().equals(this.getBrand()) && getMaxLoad() == t.getMaxLoad();
    }
}
