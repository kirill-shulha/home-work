package by.teachmeskills.homework.lesson17;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        List<String> lines = Arrays.asList("1111-aaaa-1111-aaaa-1a1a", "380864455897", "ivanov_va@gmail.com");
        Path file = Paths.get("my_file.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
    }

}
