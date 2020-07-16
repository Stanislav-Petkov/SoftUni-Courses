import java.util.Scanner;

public class TheMostPowerfulWorld06ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String mostPowerful = "";
        double asciSum = 0;
        double asciSumAfterDeletion = 0;
        boolean hasVowel = false;
        String maxName = "";
        double max = 0;
        while (!word.equals("End of words")) {
            for (int i = 0; i < word.length(); i++) {
                asciSum += (int) word.charAt(i);
                char let = word.charAt(0);
                if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u' || let == 'y'
                        || let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U' || let == 'Y') {
                    hasVowel = true;
                }
            }
            if (!hasVowel) {
                asciSumAfterDeletion = Math.floor(asciSum / word.length());
            } else {
                asciSumAfterDeletion = Math.floor(asciSum * word.length());
            }
            if (asciSumAfterDeletion > max) {
                max = asciSumAfterDeletion;
                maxName = word;
            }
            word = scanner.nextLine();
            asciSum = 0;
        }
        System.out.printf("The most powerful word is %s - %.0f", maxName, max);
    }
}

