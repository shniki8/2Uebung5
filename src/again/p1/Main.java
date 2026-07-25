package again.p1;

public class Main {
    public static void main(String[] args) {
        Article a = new Article();
        Book b = new Book();
        Game g = new Game();


        b.setName("Lord of the Rings - The Fellowship of the Ring" );
        b.setIsbn("978-0-261-10235-4");
        g.setName("Dark Souls III");

        a.showInfo();
        g.setNumPlayers(1);
        b.showInfo();
        g.showInfo();
    }
}
