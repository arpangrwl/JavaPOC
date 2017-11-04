package javaPOC.Java8.Lambda.Rough1;


import java.util.UUID;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {

        Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());

        uuidStream.limit(10).forEach(System.out::println);

    }
}
