package javaPOC.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Michael", "1"),
                new Person("Theresa", "2"), new Person("Nicole", "3"),
                new Person("Sandra", "3"));

// Group persons by their ID
        Map<String, List<Person>> peopleById = people.stream().collect(
                Collectors.groupingBy(Person::getId));

// Print out groups of people that share one ID
        peopleById
                .values()
                .stream()
                .filter(peopleWithSameId -> peopleWithSameId.size() > 1)
                .forEach(
                        peopleWithSameId -> System.out
                                .println("People with identical IDs: "
                                        + peopleWithSameId));
    }

}