public class Book {

    private long ID;
    private String title;
    private String author;
    private String ISBN;
    private int year;

    public Book() {
    }

    public Book(String title, String author, String ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    public Book(long ID, String title, String author, String ISBN, int year) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.ISBN + ", Year: " + this.year;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
