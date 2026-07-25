package again.p2;

public class PlatinumTicket extends VIPTicket{
    private static final double LUXURY_FEE = 500.0;

    @Override
    public double getPrice() {
        return super.getPrice() + LUXURY_FEE;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(LUXURY_FEE);
    }

    public static double getLuxuryFee() {
        return LUXURY_FEE;
    }

}
