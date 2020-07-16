import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[A-Z][a-z]*\\((?<value>\\d*)\\)";
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        int degree = 0;
        if (matcher.find()) {
            degree = Integer.parseInt(matcher.group("value"));
        }
        String wordInput = scanner.nextLine();
        ArrayList<String> wordsArrayList = new ArrayList<>();
        int currentStringSize = 0;
        int biggestStringSize = Integer.MIN_VALUE;
        while (!wordInput.equals("END")) {
            wordsArrayList.add(wordInput);
            currentStringSize = wordInput.length();
            if (currentStringSize > biggestStringSize) {
                biggestStringSize = currentStringSize;
            }
            wordInput = scanner.nextLine();
        }
        for (int i = 0; i < wordsArrayList.size(); i++) {
            String word = wordsArrayList.get(i);
            if (word.length() < biggestStringSize) {
                while (word.length() < biggestStringSize) {
                    word = word + " ";
                }
                wordsArrayList.set(i, word);
            }
        }
        if (degree == 0 || degree == 360 || degree % 360 == 0) {
            for (int i = 0; i < wordsArrayList.size(); i++) {
                System.out.println(wordsArrayList.get(i));
            }
        } else if (degree == 270) {
            StringBuilder lineForPrinting = new StringBuilder();
            int charPosition = biggestStringSize;
            char wordLetter = 'a';
            while (biggestStringSize > 0) {
                for (int rowFromArray = 0; rowFromArray < wordsArrayList.size(); rowFromArray++) {
                    String word = wordsArrayList.get(rowFromArray);
                    wordLetter = word.charAt(charPosition - 1);
                    lineForPrinting.append(wordLetter);
                }
                charPosition--;
                biggestStringSize--;
                System.out.println(lineForPrinting.toString());
                lineForPrinting = new StringBuilder();
            }
        } else if (degree == 180 || degree % 180 == 0) {
            StringBuilder lineForPrinting = new StringBuilder();
            int charPosition = biggestStringSize - 1;
            char wordLetter = 'a';
            for (int rowFromArray = wordsArrayList.size() - 1; rowFromArray >= 0; rowFromArray--) {
                String word = wordsArrayList.get(rowFromArray);
                while (charPosition >= 0) {
                    wordLetter = word.charAt(charPosition);
                    lineForPrinting.append(wordLetter);
                    charPosition--;
                }
                charPosition = biggestStringSize - 1;
                System.out.println(lineForPrinting.toString());
                lineForPrinting = new StringBuilder();
            }
        } else if (degree == 90 || degree % 90 == 0) {
            StringBuilder lineForPrinting = new StringBuilder();
            int charPosition = 0;
            char wordLetter = 'a';
            while (biggestStringSize > 0) {
                for (int rowFromArray = wordsArrayList.size() - 1; rowFromArray >= 0; rowFromArray--) {
                    String word = wordsArrayList.get(rowFromArray);
                    wordLetter = word.charAt(charPosition);
                    lineForPrinting.append(wordLetter);
                }
                charPosition++;
                biggestStringSize--;
                System.out.println(lineForPrinting.toString());
                lineForPrinting = new StringBuilder();
            }
        }

    }
}