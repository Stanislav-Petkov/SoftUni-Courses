import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double asciSum = 0.0;
        double counter = 1;
        double sledVadene = 0;
        double testSumGolemi = 0;
        double testSumMalki = 0;
        double testMalki = 0;
        double testGolemi = 0;
        int stoinost = 0;
        double countGolemi = 0;
        double countMalki = 0;
        double nameSum = 0;
        String maxName = "";
        double max = -1;
        double testSumDrugi = 0;
        double tesSumDrugiCnt = 0;
        double testDrugi = 0;
        while (!name.equals("STOP") || counter >= 7) {
            for (int i = 0; i < name.length(); i++) {
                char let = name.charAt(i);
                stoinost = (int) let;
                if (stoinost >= 65 && stoinost <= 90) {
                    countGolemi++;
                    testSumGolemi = testSumGolemi + (int) name.charAt(i);
                } else if (stoinost >= 97 && stoinost <= 122) {
                    countMalki++;
                    testSumMalki = testSumMalki + (int) name.charAt(i);
                } else {
                    tesSumDrugiCnt++;
                    testSumDrugi = testSumDrugi + (int) name.charAt(i);
                }
            }
            testMalki = testSumMalki - 2 * name.length() * countMalki;
            testGolemi = testSumGolemi - name.length() * countGolemi;
            testDrugi = testSumDrugi * tesSumDrugiCnt;
            nameSum = testMalki + testGolemi + testDrugi;
            counter++;
            if (nameSum > max) {
                max = nameSum;
                maxName = name;
            }
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            name = scanner.nextLine();
            countGolemi = 0;
            testSumGolemi = 0;
            countMalki = 0;
            testSumMalki = 0;
            tesSumDrugiCnt = 0;
            testSumDrugi = 0;
            if (name.equals("STOP")) {
                break;
            }
        }
        System.out.printf("The best movie for you is %s with %.0f ASCII sum.", maxName, max);
    }
}