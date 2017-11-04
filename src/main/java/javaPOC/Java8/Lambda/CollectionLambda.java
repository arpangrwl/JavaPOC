package javaPOC.Java8.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Arpan on 9/10/17.
 */
public class CollectionLambda {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Arpan", "Agrawal", 29),
                new Person("Lewis", "Carroll", 35),
                new Person("Pulkit", "Goel", 32),
                new Person("Ankit", "Singhal", 33),
                new Person("Shubham", "Agarwal", 31),
                new Person("Rizul", "Jain", 27)
        );

//        people.forEach(System.out::println);
//
//        System.out.println("Print only First name");
//
//        people.forEach((p) -> System.out.println(p.getfName()));
//
//
        Collections.sort(people, (p1,p2)-> p1.getfName().compareTo(p2.getfName()));
        people.forEach((p) -> System.out.println(p));

        System.out.println("\n\n\n\n");

        Collections.sort(people, (p1,p2)-> ((p1.getAge() > p2.getAge()) ? 1 : (p1.getAge() < p2.getAge()) ? -1 : 0));
        people.forEach((p) -> System.out.println(p));
    }
}
