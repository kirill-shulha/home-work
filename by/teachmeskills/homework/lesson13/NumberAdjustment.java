package by.teachmeskills.homework.lesson13;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class NumberAdjustment {
    public static void main(String[] args) throws IOException {
        String s1 = "numbers.txt";
        BufferedReader reader = new BufferedReader(new FileReader(s1));
            Set<String> lines = new HashSet<>(10);
            String line;
        while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(s1));
            for (String unique : lines) {
                writer.write(unique);
                writer.newLine();
            }
            writer.close();
        System.out.println(s1);
        }
    }
