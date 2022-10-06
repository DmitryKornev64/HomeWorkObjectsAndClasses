import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }


    public String getFullName() {
        return this.name + " " + this.surname;
    }

    //1.10. Методы объектов
    public String toString() {
        return this.name + " " + surname;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
