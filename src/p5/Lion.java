package p5;

public class Lion extends Animal{
    private int strength;
    public Lion(String name, int energy, int strength){
        super(name,energy);
        this.strength = strength;
    }
    public void makeSound(){
        System.out.println("Roar!");
    }
}
