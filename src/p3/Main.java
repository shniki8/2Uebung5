package p3;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setBrand("Generic Vehicle");
        Car c1 = new Car();
        c1.setHorsePower(320);
        c1.setBrand("BMW");
        Truck t1 = new Truck();
        t1.setBrand("MAN");
        t1.setMaxLoad(18.5);
        v1.showInfo();
        c1.showInfo();
        t1.showInfo();
        Vehicle v2 = v1.createCopy();
        Car c2 = c1.createCopy();
        Truck t2 = t1.createCopy();
        v2.showInfo();
        c2.showInfo();
        t2.showInfo();

        //Antwort zur e): Weil Car in der Vererbungshierachie unter Vehicle ist, ist der Datentyp eine Spezifikation, andersrum generalisiert Vehicle Car bzw. Truck analog. Da der Rueckgabetyp nach VL spezifischer sein darf, ist dies erlaubt.

    }

}
