package again.p2;

public class Main {
    public static void main(String[] args) {
        //Arrange, Act, Assert aber manuell :')
        Ticket t = new Ticket();
        VIPTicket vT = new VIPTicket();
        PlatinumTicket pT = new PlatinumTicket();

        t.setEvent("24h race");
        t.setBasePrice(40.0);
        vT.setEvent("24h race");
        vT.setBasePrice(40.0);
        vT.setSurcharge(70.0);
        pT.setEvent("24h race");
        pT.setBasePrice(40.0);
        pT.setSurcharge(70.0);

        System.out.println(t.getPrice());
        System.out.println(vT.getPrice());
        System.out.println(pT.getPrice());

        System.out.println(Ticket.getTicketsSold());




    }
}
