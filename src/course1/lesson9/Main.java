package course1.lesson9;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Брюс", "Эккель");
        Book book1 = new Book("Философия Java", author1, 2023);

        Author author2 = new Author("Герберт", "Шилтд");
        Book book2 = new Book("Java. Руководство для начинающих", author2, 2018);

        book1.setPubYear(2022);

        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.getAuthor().getSurname() = " + book1.getAuthor().getSurname());
        System.out.println("book1.getAuthor().getName() = " + book1.getAuthor().getName());
        System.out.println("book1.getPubYear() = " + book1.getPubYear());


    }
}
