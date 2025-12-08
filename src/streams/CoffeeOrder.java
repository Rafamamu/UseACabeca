package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {
    public static void main(String[] args) {

        List<String> coffes = List.of("Cappucchino",
                "Americano", "Espresso", "Cortado", "Mocha",
                "Cappucchino", "Flat White", "Latte");

        List<String> coffesEndingInO = coffes.stream()
                .distinct()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(coffesEndingInO);
    }
}
