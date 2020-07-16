import java.util.Scanner;

public class GenerateZeroOneVector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] numbers = new Integer[n];
        fillVector(numbers,0);
    }
    private static void fillVector(Integer[] numbers,int index){
        if(index >= numbers.length){
            print(numbers);
            return;
        }

        for(int i = 0; i <= 1; i++) {
            numbers[index] = i;
            fillVector(numbers, index + 1);
        }
    }
    private static void print(Integer[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}

/*
     Integer[] memory = new Integer[n];

        fillVector(memory, 0);
    }

    private static void fillVector(Integer[] memory, int index) {
        if (index >= memory.length) {
            print(memory);
            return;
        }
        for (int i = 0; i <= 1 ; i++) {
            memory[index] = i;
            fillVector(memory,index + 1);
        }
    }

    private static void print(Integer[] memory) {
        for (Integer integer : memory) {
            System.out.print(integer);
        }
        System.out.println();
    }
}
 */