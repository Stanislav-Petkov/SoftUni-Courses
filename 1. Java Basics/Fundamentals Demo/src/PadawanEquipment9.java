import java.util.Scanner;

//100/100
public class PadawanEquipment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCnt = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double total = 0;
        double belts = 0;
        int freeBelts = studentsCnt / 6;
        double sprice = 0;
        double rprice = 0;
        double bprice = 0;
        sprice = sabresPrice * Math.ceil((studentsCnt + (studentsCnt * 0.1)));
        rprice = robePrice * studentsCnt;
        bprice = beltPrice * (studentsCnt - freeBelts);
        price = sprice + rprice + bprice;
        if (amountOfMoney >= price) {
            System.out.printf("The money is enough - it would cost %.2flv.", (price));
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(amountOfMoney - price));
        }
    }
}
