public class Book {
    private  String String;
    private  String Author;
    private int yearPublication;

    public Book(String String, String Author, int yearPublication) {
        this.String = String;
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getString() {
        return this.String;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }
}
