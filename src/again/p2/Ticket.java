package again.p2;

public class Ticket {
    private static int ticketsSold;
    private String event;
    private double basePrice;
    public Ticket(){
        ticketsSold++;


    }

    public void showInfo(){
        System.out.println(this);

    }

    public static int getTicketsSold() {
        return ticketsSold;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }


    public double getPrice(){
        return basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return event + " : " + ticketsSold;
    }
    @Deprecated(forRemoval = true)
    public <T> void tjaWofuerDieWohlDaIst(T t){

    }
}
