package course1.lesson9;

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
}
