package paket01.fuhrpark;

public class FahrzeugUtility {
    static void create(int audi, int skoda){
        Audi.counter+=audi;
        Skoda.counter+=skoda;
        //Geht, da sie halt jetzt im gleichen Package sind obv.

    }
    /*static void create(int audi, int skoda,int byd){ //überladen
        Audi.counter+=audi;
        Skoda.counter+=skoda;
        //Geht
        BYD.counter+=byd;
        //Geht nicht, da explizit gefordert ist die Marke in einem anderen Package zu verwalten.

    }*/
}
