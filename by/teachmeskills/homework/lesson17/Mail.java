package by.teachmeskills.homework.lesson17;

import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String emailPattern = " [a-zA-Z0-9]{3,15}@[a-zA-Z0-9]{3,15}[.][a-zA-Z]{2,5}";
            System.out.print("Input your email(email@address.com): ");
            String input = sc.next();
            flag = input.matches(emailPattern);
            if (!flag) System.out.println("Invalid data!");
        } while (!flag);
        System.out.println("Valid data");
    }
}

