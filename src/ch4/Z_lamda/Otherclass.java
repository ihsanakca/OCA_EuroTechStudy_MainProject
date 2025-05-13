package ch4.Z_lamda;

import java.util.function.Predicate;

public class Otherclass {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> s.length()>5;

        System.out.println("stringPredicate.test(\"ada\") = " + stringPredicate.test("ada"));

    }
}
