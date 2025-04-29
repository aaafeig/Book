public class Author {
    String firstName;
    String surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return firstName + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstName.equals(c2.firstName) && surname.equals(c2.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, surname);
    }
}
