package by.teachmeskills.homework.lesson17;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String phonePattern = "(\\d{3}-)?\\d{2}-\\d{7}";
            System.out.print("Input your phone(xxx-xx-xxxxxxx): ");
            String input = sc.next();
            flag = input.matches(phonePattern);
            if (!flag) System.out.println("Invalid data!");
        } while (!flag);
        System.out.println("Valid data");
    }
}
