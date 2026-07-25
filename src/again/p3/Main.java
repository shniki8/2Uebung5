package again.p3;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Truck t = new Truck();


        v.setBrand("Generic Vehicle");
        c.setBrand("BMW");
        c.setHorsePower(320);
        t.setBrand("MAN");
        t.setMaxLoad(18.5);

        Vehicle v2 = v.createCopy();
        Car c2 = c.createCopy();
        Truck t2 = t.createCopy();

        System.out.println(v.equals(v2) + "" + c.equals(c2) + t.equals(t2));

    }
}
