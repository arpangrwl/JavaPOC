package javaPOC.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Conditional {
    public boolean inputVal(Person s);
}

class Person {
    String fName;
    String lName;
    int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class PracticeLambda1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Arpan", "Agrawal", 29),
                new Person("Lewis", "Carroll", 35),
                new Person("Pulkit", "Goel", 32),
                new Person("Ankit", "Singhal", 33),
                new Person("Shubham", "Agarwal", 31),
                new Person("Rizul", "Jain", 27)
        );

        //Step 1 : Sort list by Last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getlName().compareTo(o2.getlName());
            }
        });


        //Step 2 : Create a methord that prints all elements in the list
         printCondition(people, p -> true);

        Conditional c = new Conditional() {
            @Override
            public boolean inputVal(Person s) {

                if (s.getlName().startsWith("A"))
                    return true;
                else
                    return false;
            }
        };

        Conditional c1 = (Person s) -> {
            if (s.getlName().startsWith("A"))
                return true;
            else
                return false;
        };

        //Step 3 : Create a method that prints all people that have last name begins with A
        printCondition(people, c1);
    }


    public static void printCondition(List<Person> l, Conditional c) {
        for (Person p : l)
            if (c.inputVal(p))
                System.out.println(p);
    }


}
