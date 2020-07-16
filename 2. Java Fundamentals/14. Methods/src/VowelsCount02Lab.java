import java.util.*;
public class VowelsCount02Lab {

    private static int getVowelsCount(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            switch (symbol){
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                    count++;
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        System.out.println(getVowelsCount(input));
    }

}

/*
//moe reshenie 100/100
static int getVowel (String name){
            int count = 0;
            for(int i = 0; i < name.length(); i++){
                char letter = name.charAt(i);
                if(letter == 'a'|| letter == 'A'|| letter == 'o'|| letter == 'O'||
                        letter == 'U'|| letter == 'u'|| letter == 'y'|| letter == 'Y'||
                        letter == 'e'|| letter == 'E'|| letter == 'i'|| letter == 'I'){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int result = getVowel(name);   System.out.println(result);
        }
 */