package p2;

public class VIPTicket extends Ticket{
    private double surcharge;
    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
    public double getPrice(){
        return super.getPrice()+surcharge;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(" Surcharge: " + surcharge);
    }


}
