package p2;

public class Ticket {
    private static int ticketsSold;
    private String event;
    private double basePrice;

    public double getBasePrice() {
        return basePrice;
    }
    //"Ergänzen Sie Getter und Setter für event und basePrice"
    //"getPrice(): gibt basePrice zurück"
    public double getPrice(){
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Ticket(){
        ticketsSold++;

    }
    public static int getTicketsSold(){
        return ticketsSold;
    }
    public void showInfo(){
        System.out.println("Event: " + event + " Base price: " + basePrice);
    }

}
