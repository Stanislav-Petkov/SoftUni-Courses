import java.util.Scanner;

public class PokeMon10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int halsfOfOriginalValue = n / 2;
        while (n >= m) {
            n -= m;
            if (n == halsfOfOriginalValue && y > 0) {
                n /= y;
            }
            counter++;
        }
        System.out.println(n);
        System.out.println(counter);
    }
}

/*

//60/100

import java.util.Scanner;

public class PokeMon10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int var = n;
        int counter = 0;
        while (var > m) {

            var = var - m;
            counter++;
            if(var == 0.5 * n){
                var =  ( var / y);
            }
        }
        //System.out.printf("%.0f%n",var);
        System.out.println(var);
        System.out.println(counter);

    }
}


 */
/*

//100/100
 Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        int halsfOfOriginalValue = n / 2;
        while (n >= m) {
            n -= m;
            if (n == halsfOfOriginalValue && y > 0) {
                n /= y;
            }
            counter++;
        }
        System.out.println(n);
        System.out.println(counter);

    }

 */