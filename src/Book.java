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

    @Override
    public String toString() {
        return "Название: " + title + "." + " " + "Автор: " + author.toString() + "." + " " + "Год публикации " +yearPublication;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.title) && author.equals(c2.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author);
    }
}
