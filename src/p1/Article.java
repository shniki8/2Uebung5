package p1;

public class Article {
    static int counter;
    protected String name = "Unknown Name";

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Article(){
        counter++;
    }
    public void showInfo(){
        System.out.println("Counter: " + counter + " " + "Name: " + name);
    }
}
