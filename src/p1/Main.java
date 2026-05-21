package p1;

public class Main {
    public static void main(String[] args) {
        Article a1 = new Article();
        Book b1 = new Book();
        b1.setIsbn("978-0-261-10235-4");
        b1.setName("Lord of the Rings - The Fellowship of the Ring"); // Ach ja, Erinnerungen :')
        Game g1 = new Game();
        g1.setName("Monopoly"); //Ragebait Spiel
        g1.setNumPlayer(6);

        a1.showInfo();
        b1.showInfo();
        g1.showInfo();


    }
}
