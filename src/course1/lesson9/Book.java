package course1.lesson9;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int pubYear;

    public Book (String name, Author author, int pubYear) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getName () {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    @Override
    public String toString () {
        return author + " '" + name + "'" + ", " + pubYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
       // return name.equals(book.name)&&(author.equals(book.author));
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
