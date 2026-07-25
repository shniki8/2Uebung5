package again.p2;

public class VIPTicket extends Ticket{
    double surcharge; //$$$$$$

    @Override
    public double getPrice() {
        return super.getPrice() + surcharge;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(surcharge);
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
}
