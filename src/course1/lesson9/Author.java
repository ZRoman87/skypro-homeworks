package course1.lesson9;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName () {
        return this.name;
    }

    public String getSurname () {
        return this.surname;
    }

    @Override
    public String toString () {
        return name + ' ' + surname;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        //return name.equals(author.name)&&(surname.equals(author.surname));
        return Objects.equals(name, author.name) && Objects.equals(surname,author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
