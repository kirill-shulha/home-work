package by.teachmeskills.classwork.lesson10;

import java.util.Arrays;

public class MainClass4 {
    public static void main(String[] args) {
        System.out.println("test".compareTo("aest"));//aest, test
        System.out.println("test".compareTo("test"));//0
        System.out.println("test".compareTo("zest"));// test, zest
        System.out.println("test".compareTo("test1"));//a, aaa, aaaaa

        String str = "This is our string";
        System.out.println(str.toLowerCase().contains("our".toLowerCase()));
    }
}
