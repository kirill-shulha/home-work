package by.teachmeskills.homework.lesson13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {

    public static void main(String[] args) {
            try (FileWriter fileWriter = new FileWriter("numbers.txt", true)) {

                fileWriter.write("1 2 3 4 4 5 5 6 6 8 8 9 10 10\n");
                throw new IOException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

