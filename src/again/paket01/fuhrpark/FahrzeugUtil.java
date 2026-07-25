package again.paket01.fuhrpark;

import again.paket01.china.BYD;

public class FahrzeugUtil {
   public static void create(int audi, int skoda){
        Audi.counter = audi;
        Skoda.counter = skoda;
       System.out.println(Audi.counter);
       System.out.println(Skoda.counter);
    }
   public static void create(int audi, int skoda, int byd){
       create(audi,skoda);
       //BYD.counter = byd;
       //BYD müsste in Fuhrpark.
   }
}
