package p2;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        System.out.println(Ticket.getTicketsSold());
        t1.setEvent("24h race");
        t1.setBasePrice(40.0);
        VIPTicket vipt1 = new VIPTicket();
        System.out.println(Ticket.getTicketsSold());
        vipt1.setEvent("24h race");
        vipt1.setSurcharge(70.0);
        vipt1.setBasePrice(40.0);
        PlatinumTicket plt1 = new PlatinumTicket();
        System.out.println(Ticket.getTicketsSold());
        plt1.setEvent("24h race");
        plt1.setBasePrice(40.0);
        plt1.setSurcharge(70.0);
        t1.showInfo();
        System.out.println(t1.getPrice());
        vipt1.showInfo();
        System.out.println(vipt1.getPrice());
        plt1.showInfo();
        System.out.println(plt1.getPrice());
        //Ich persoenlich haette es anders gemacht, die Aufgabe erfordert es nunmal leider so.
        //anstatt für alles die Setter aufzurufen hätte man ja auch einfach Konstruktoren benutzen können...

    }
}
