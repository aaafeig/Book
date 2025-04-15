public class Book {
    private  String title;
    private  Author author;
    private int yearPublication;

    public Book(String String, Author author, int yearPublication) {
        this.title = String;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }

    public void setAuthor(Author author) {this.author = author;}

    public void setTitle(String title) {this.title = title;}
}
