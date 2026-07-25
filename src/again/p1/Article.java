package again.p1;

public class Article {
    static int counter = 0;
    protected String name = "Unknown Name";

    public Article(){
        counter++;
    }

    public void showInfo(){
        System.out.println("Count: " + counter + " Name: " + getName());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
