package javaPOC.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class First {

    public static void main(String[] args) {

        String arr[] = {"hello", "ho", "are", "you"};
        List<String> l = Arrays.asList(arr);

        Stream<String> streams = l.stream().map(a -> a.toUpperCase());
        streams.filter(b -> b.startsWith("H")).forEach(n -> System.out.print(n + "  "));

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }
}
