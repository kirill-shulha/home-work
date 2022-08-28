package by.teachmeskills.homework.lesson9;

import java.util.Random;

public class TestClass {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        System.out.println("Get winner candidate: ");
    }
}
