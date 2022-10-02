package by.teachmeskills.homework.lesson13;

import java.util.Arrays;

public class AlphabetOrder {
    public static void main(String[] args) {
        String s = "i want to read the words in alphabetical order";
        String[] words = s.split("\\s+");
        Arrays.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
