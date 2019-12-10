package pl.accenture;
// napisanie innej adnotacji


public class Person2 {
    String name;
    String lastName;


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
