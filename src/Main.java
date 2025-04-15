public class Main {
    public static void main(String[] args)
    {
        Author author1 = new Author("Сергей", "Пушкин");
        Author author2 = new Author("Михаил", "Булгаков");

        Book book1 = new Book("Евегений Онегин", author1, 1820);
        Book book2 = new Book("Собачье сердце", author2, 1925);

        System.out.println("book1.getYearPublication() = " + book1.getYearPublication());
        book1.setYearPublication(1823);
        System.out.println("book1.getYearPublication() = " + book1.getYearPublication());
        System.out.println("book1.getString() = " + book1.getTitle());
        System.out.println("book1.getAuthor() = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSurname());
        System.out.println("book2.getString() = " + book2.getTitle());
        System.out.println("book2.getAuthor() = " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getSurname());
        System.out.println("book2.getYearPublication() = " + book2.getYearPublication());
    }
}