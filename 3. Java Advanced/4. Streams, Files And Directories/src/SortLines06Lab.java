import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines06Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = "files-resources/input.txt";
        String output = "output.txt";
        Path path = Paths.get(input);
        Path outputPath = Paths.get(output);
        try{
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream()
                    .collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(outputPath,lines);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
/*
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines06Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = "files-resources/input.txt";
        String output = "output.txt";
        Path path = Paths.get(input);
        Path outputPath = Paths.get(output);
        try{
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream()
                    .filter(l -> !l.isBlank())
                    .collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(outputPath,lines);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

 */
