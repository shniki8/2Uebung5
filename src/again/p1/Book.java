package again.p1;

import jdk.jfr.Description;

@Description("PEAK")
public class Book extends Article{
    String isbn;


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" " + getIsbn() + "\n");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
