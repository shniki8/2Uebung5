package again.paket01;

import again.paket01.fuhrpark.FahrzeugUtil;

public class Main {
    public static void main(String[] args) {
        create(3,4);
    }

    public static void create(int audi, int skoda){
        FahrzeugUtil.create(audi,skoda);
    }
}
