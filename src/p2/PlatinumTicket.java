package p2;

public class PlatinumTicket extends VIPTicket{
    private static final double LUXURY_FEE = 500.0;

    public static double getLuxuryFee(){
        return LUXURY_FEE;
    }

    public double getPrice(){
        return super.getPrice() + LUXURY_FEE;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(" Luxury fee: " + LUXURY_FEE);

    }
}
