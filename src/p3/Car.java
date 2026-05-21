package p3;

public class Car extends Vehicle{
    private int horsePower; //Angabe in Einheit: Pferde pro Staerke                                                                  //KMS

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public Car createCopy(){
        Car a = new Car();
        a.setBrand(this.getBrand());
        a.setHorsePower(this.getHorsePower());
        return a;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("HP: "+horsePower);
    }
}
