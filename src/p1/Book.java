package p1;

public class Book extends Article{
    private String isbn = "";
    public String isbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void showInfo(){
        super.showInfo();
        System.out.print(" ISBN: " + isbn);
        System.out.println();
    }

}
