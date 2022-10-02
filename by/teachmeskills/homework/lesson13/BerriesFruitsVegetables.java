package by.teachmeskills.homework.lesson13;

import java.util.*;

public class BerriesFruitsVegetables {
    final Map<String, Set<String>> map = Collections.unmodifiableMap(
            new HashMap<String,Set<String>>() {
                {
                    put(
                            "Berries",
                            Set.of("Watermelon", "Blueberry", "Strawberry")
                    );

                    put(
                            "Fruits",
                            Set.of("Banana", "Cherry", "Grapes")
                    );

                    put (
                            "Vegetables",
                            Set.of("Cucumber", "Tomato", "Pumpkin", "Onion")
                    );
                }
            }
    );
}
