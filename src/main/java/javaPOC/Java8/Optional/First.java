package javaPOC.Java8.Optional;

import java.util.Optional;

/**
 * Created by Arpan on 10/10/17.
 */
public class First {

    public static void main(String[] args) {


        Optional<String> optinal = Optional.of("Male");
        Optional empty = Optional.empty();
        String value = "Arpan";

        String val = "Arpan";

        System.out.println(optinal.ofNullable(val));
        System.out.println(empty);

        if(optinal.isPresent()){
            System.out.println("Hello");
        }

        optinal.ifPresent(g -> System.out.println("Do this"));

    }
}
