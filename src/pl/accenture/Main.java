package pl.accenture;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
     Stream<String> stringStream = Stream.of("Ala", "ma","kota");
stringStream.forEach(s->{
    System.out.println(s);
});
// Sream Bilder
        System.out.println("drugi przyklad");
Stream.<String>builder()
        .add("Ala")
        .add("ma")
        .add("kota")
        .build()
        .filter(s->s.startsWith("A"))
        .forEach(s-> System.out.println(s));
        myVararg();
        myVararg("");
        System.out.println("Predicat");
        Predicate<Person> nameStartWithPredicate = person -> person.name.startsWith("A");
        Predicate<Person> ageBelow20Predicate = person -> person.age > 20;
        List<Person> people= Arrays.asList(
        new Person("Lukasz",15),
        new Person("Kasia",20),
        new Person("Agnieszka",30),
        new Person("Basia",21),
        new Person("Marysia",55),
        new Person("Lukasz",44));
        people.stream().filter(nameStartWithPredicate.and(ageBelow20Predicate)).collect(Collectors.toList()).forEach(s-> System.out.println(s));

    }
    static void myVararg(String ... s){

    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

