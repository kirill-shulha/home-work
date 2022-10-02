package by.teachmeskills.homework.lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourElements {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList
            (1,1,2,2,3,3,4,4,5,5,6,7,8,9,10,11,12,13,14,15,16,17));
    Stream<Integer> intStream = numbers.parallelStream();
    Stream<Integer> myNextStream = Stream.of(1,2,3,4,5);
    Stream<List<Integer>> listStream = Stream.of(numbers, numbers);
    Set<Integer> myResultList = listStream
            .distinct()
            .flatMap(Collection::stream)
            .filter(x-> x >0)
            .limit(8)
            .collect(Collectors.toSet());
    System.out.println(myResultList);

}
}

