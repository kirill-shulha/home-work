package by.teachmeskills.classwork.lesson10;

import java.util.Arrays;

public class MainClass2 {
    public static void main(String[] args) {
        String testString = "This is our big String";
        System.out.println(testString.charAt(2));
        char[] myChars = new char[3];
        testString.getChars(6, 9, myChars, 0);
        System.out.println(Arrays.toString(myChars));
        char needed = 'i';
        int count = 0;
        for (char element : testString.toCharArray()) {

            if (element == needed) {
                count++;
            }
        }
        System.out.println(count);
        String intToStr = String.valueOf(4);
        int index = testString.indexOf("is");
        System.out.println(index);
        int lastIndex = testString.lastIndexOf("is");
        System.out.println(lastIndex);
        System.out.println(testString.startsWith("This"));
        System.out.println(testString.endsWith("ing"));
        testString=testString.replace('i','a').replace('a','u');
        System.out.println(testString);

        System.out.println("FFFFFgggggHHHHHjjjjjj".toLowerCase());
        System.out.println("FFFFFgggggHHHHHjjjjjj".toUpperCase());
        String messageString = " this is my house";
        String[] messageArray = messageString.split(" ");
        System.out.println(Arrays.toString(messageArray));
        System.out.println(messageArray[0].isEmpty());
        String isEmptyString = null;
        System.out.println(isEmptyString== null || isEmptyString.isEmpty());
        System.out.println(isEmptyString== null || isEmptyString.isBlank());

        index =messageString.indexOf("is");
        System.out.println(messageString.substring(index+2));

    }
}
