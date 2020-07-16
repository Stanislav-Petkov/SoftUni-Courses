import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterTypes04Lab {

    public static int[] counts = new int[3];

    public static void main(String[] args) throws IOException {
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        PrintWriter writer = new PrintWriter(output);
        Scanner scanner = new Scanner(new File(input));


        String vowels = "aeiou";
        String puntuation = "?,.!";

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            if (vowels.contains(String.valueOf(symbol))) {
                                counts[0]++;
                            } else if (puntuation.contains(String.valueOf(symbol))) {
                                counts[2]++;
                            } else {
                                counts[1]++;
                            }
                        }

                    });

        }
        writer.println("Vowels: " + counts[0]);
        writer.println("Consonants: " + counts[1]);
        writer.println("Punctuation: " + counts[2]);
        writer.close();
    }
}
/*
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterTypes04Lab {

    public static int[] counts = new int[3];
    public static void main(String[] args) throws IOException {
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        PrintWriter writer = new PrintWriter(output);
        Scanner scanner = new Scanner(new FileReader(input));


        String vowels = "aeiou";
        String puntuation = "?,.!";

        while (scanner.hasNext()){
            String line = scanner.nextLine();

            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            if(vowels.contains(String.valueOf(symbol))){
                                counts[0]++;
                            }else if(puntuation.contains(String.valueOf(symbol))){
                                counts[2]++;
                            }else {
                                counts[1]++;
                            }
                        }

                    });

        }
        writer.println("Vowels: " + counts[0]);
        writer.println("Consonants: " + counts[1]);
        writer.println("Punctuation: " + counts[2]);
        writer.close();
    }
}

/*
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterTypes04Lab {

    public static int[] counts = new int[3];
    public static void main(String[] args) throws IOException {
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        PrintWriter writer = new PrintWriter(output);
        Scanner scanner = new Scanner(new FileReader(input));


        String vowels = "aeiou";
        String puntuation = "?,.!";

        while (scanner.hasNext()){
            String line = scanner.nextLine();

            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            if(vowels.contains(String.valueOf(symbol))){
                                counts[0]++;
                            }else if(puntuation.contains(String.valueOf(symbol))){
                                counts[2]++;
                            }else {
                                counts[1]++;
                            }
                        }

                    });

        }
        writer.println("Vowels: " + counts[0]);
        writer.println("Consonants: " + counts[1]);
        writer.println("Punctuation: " + counts[2]);
        writer.close();
    }
}

 */
/*
100
import java.io.*;
import java.util.Scanner;

public class CountCharacterTypes04Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String line = bufferedReader.readLine();

        int vowel = 0;
        int consonant = 0;
        int punctCounter = 0;
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                if (symbol != ' ') {
                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                        vowel++;
                    } else if (symbol == '.' || symbol == '!' || symbol == ',' || symbol == '?') {
                        punctCounter++;
                    }else {
                        consonant++;
                    }
                }
            }

            line = bufferedReader.readLine();
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Punctuation: " + punctCounter);

    }
}
 */

/*

import java.io.*;
import java.util.Scanner;

public class CountCharacterTypes04Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String line = bufferedReader.readLine();

        int vowel = 0;
        int consonant = 0;
        int punctCounter = 0;
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                if (symbol != ' ') {
                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                        vowel++;
                    } else if (symbol == '.' || symbol == '!' || symbol == ',' || symbol == '?') {
                        punctCounter++;
                    } else {
                        consonant++;
                    }
                }
            }

            line = bufferedReader.readLine();
        }
        bufferedWriter.write("Vowels: " + vowel);
        bufferedWriter.newLine();
        bufferedWriter.write("Consonants: " + consonant);
        bufferedWriter.newLine();
        bufferedWriter.write("Punctuation: " + punctCounter);
        bufferedWriter.close();

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Punctuation: " + punctCounter);

    }
}
 */


/*
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterTypes04Lab {

    public static int[] counts = new int[3];
    public static void main(String[] args) throws IOException {
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        PrintWriter writer = new PrintWriter(output);
        Scanner scanner = new Scanner(new FileReader(input));


        String vowels = "aeiou";
        String puntuation = "?,.!";

        while (scanner.hasNext()){
            String line = scanner.nextLine();

            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            if(vowels.contains(String.valueOf(symbol))){
                                counts[0]++;
                            }else if(puntuation.contains(String.valueOf(symbol))){
                                counts[2]++;
                            }else {
                                counts[1]++;
                            }
                        }

                    });

        }
        writer.println("Vowels: " + counts[0]);
        writer.println("Consonants: " + counts[1]);
        writer.println("Punctuation: " + counts[2]);
        writer.close();
    }
}

 */
/*
100
import java.io.*;
import java.util.Scanner;

public class CountCharacterTypes04Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String line = bufferedReader.readLine();

        int vowel = 0;
        int consonant = 0;
        int punctCounter = 0;
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                if (symbol != ' ') {
                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                        vowel++;
                    } else if (symbol == '.' || symbol == '!' || symbol == ',' || symbol == '?') {
                        punctCounter++;
                    }else {
                        consonant++;
                    }
                }
            }

            line = bufferedReader.readLine();
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Punctuation: " + punctCounter);

    }
}
 */

/*

import java.io.*;
import java.util.Scanner;

public class CountCharacterTypes04Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        String output = "output.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String line = bufferedReader.readLine();

        int vowel = 0;
        int consonant = 0;
        int punctCounter = 0;
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                if (symbol != ' ') {
                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                        vowel++;
                    } else if (symbol == '.' || symbol == '!' || symbol == ',' || symbol == '?') {
                        punctCounter++;
                    } else {
                        consonant++;
                    }
                }
            }

            line = bufferedReader.readLine();
        }
        bufferedWriter.write("Vowels: " + vowel);
        bufferedWriter.newLine();
        bufferedWriter.write("Consonants: " + consonant);
        bufferedWriter.newLine();
        bufferedWriter.write("Punctuation: " + punctCounter);
        bufferedWriter.close();

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Punctuation: " + punctCounter);

    }
}
 */