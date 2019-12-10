package pl.accenture;

import org.w3c.dom.ls.LSOutput;

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
        System.out.println("Zajecia z poniedziałku");
        List<String> upperCaseList = Arrays.asList("A","B","C","D");
        List<String> lowerCaseList= upperCaseList.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(upperCaseList);
        System.out.println(lowerCaseList);

        Person2 person2A = new Person2("Arek","Kowalski");
        Person2 person2B = new Person2("Basia","Zawadezka");
        Person2 person2C = new Person2("Aneta","Jasińska");
        Person2 person2G = new Person2("Iwona","Michalak");
        Person2 person2H = new Person2("Marta","Sobońi");
        List<Person2> person2List = Arrays.asList(person2A,person2B,person2C,person2G,person2H);
        List<String> peopleNames = person2List.stream().map(p -> p.name).collect(Collectors.toList());
        System.out.println(person2List);
        System.out.println(peopleNames);
        List<Person2> uperCase = person2List.stream().map(p -> new Person2(p.name.toUpperCase(),p.lastName.toUpperCase())) .collect(Collectors.toList());
        System.out.println(uperCase);
        String[][] data = new String[][]{{"a","b"},{"c","d"},{"e","f"},{"e","f"}};

        Stream<String[] > streamTablic = Arrays.stream(data);
        Stream<String> strumieniStringow = streamTablic.flatMap(arr-> Arrays.stream(arr));
        System.out.println(strumieniStringow);
        System.out.println("Odfiltrowanie e");
        strumieniStringow.filter(s->s.equals("e")).map(String::toUpperCase).forEach(System.out::println);

        //zmiana wielkiej litery


    }
    static void myVararg(String ... s){

    }
}
class Person{
    // zmiana lokalnie
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

