import java.util.Scanner;

public class BackIn30MinutesLab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes += 30;
        if (minutes >= 60) {
            hours++;
            minutes -= 60;

            if (hours >= 24) {
                hours -= 24;
            }
        }
        if (minutes < 10) {
            System.out.printf("%d:%02d%n", hours, minutes);
        } else {
            System.out.printf("%d:%d%n", hours, minutes);
        }
    }
}

/*

//moe rehsenie 57/100
import java.util.Scanner;

public class BackIn30MinutesLab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());



            if( h == 23 && m > 30){
                System.out.printf("0:%d",(m + 30) - 60);
            }//else if(((m + 30) - 60) < 10){
             //   System.out.printf("%d:0%d", h + 1, (m + 30) - 60);
            else if(m <= 9) {
                System.out.printf("%d:%d",h,m+30);
            }else if(m >= 30 && m < 40) {
                System.out.printf("%d:0%d",h+1,(m+30)%60  );
            }else if(m >= 40){
                System.out.printf("%d:%d",h+1,(m+30)%60  );
            }
             //else{
            //    System.out.printf("%d:%d", h + 1, (m + 30) - 60);
           // }

//        else if(m % 60 > 0){
//            System.out.printf("%d:%d", h+1,(m+30) %60 );
//        }else if(m % 60 <=9){
//            System.out.printf("%d:0%d", h+1,(m+30) %60 );
//        }
    }
}

 */