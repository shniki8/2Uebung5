package p5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        for (int i = 0; i < animals.length; i++) {
            if (i%2== 0){
              animals[i] = new Parrot("Parrot "+i,i*4,"Hello World!");
            } else{
                animals[i] = new Lion("Lion "+ i,i*4, 69+i);
            }
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + ":");
            animals[i].makeSound();
        }
    }
}
