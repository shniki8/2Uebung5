package p5;

public class Animal {
    private String name;
    private int energy;

    public  Animal(String name, int energy){
        this.name = name;
        this.energy = energy;

    }
    public void makeSound(){
        System.out.println("Animal sound");
    }
    public void eat(int food){
        setEnergy(getEnergy()+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
