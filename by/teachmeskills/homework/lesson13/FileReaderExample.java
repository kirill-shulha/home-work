package by.teachmeskills.homework.lesson13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
        public static void main(String[] args) {
            try (FileReader fileReader = new FileReader("numbers.txt")) {
                Scanner scanner = new Scanner(fileReader);
                while (scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

