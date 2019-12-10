package pl.accenture;
// zmiana w klasie person

public class Person2 {
    String name;
    String lastName;
    // konstruktor z dwoma parametrami

    public Person2(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
