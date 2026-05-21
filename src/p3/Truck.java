package p3;

public class Truck extends Vehicle{
    private double maxLoad;

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    public Truck createCopy(){
        Truck a = new Truck();
        a.setBrand(this.getBrand());
        a.setMaxLoad(this.getMaxLoad());
        return a;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("max. load: "+maxLoad);
    }
}
