
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelRoomExam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        BigDecimal studioPrice = new BigDecimal(50.00);
        BigDecimal apartamentPrice = new BigDecimal(65.00);
        BigDecimal studioRent = new BigDecimal(0.00);
        BigDecimal apartamentRent = new BigDecimal(0.00);
        switch (month) {
            case "May":
            case "October":
                studioPrice = new BigDecimal(50.00);
                apartamentPrice = new BigDecimal(65.00);
                studioRent = studioPrice.
                        multiply(new BigDecimal(nights));
                apartamentRent = apartamentPrice.
                        multiply(new BigDecimal(nights));
                if (nights > 14) {
                    studioRent = studioPrice.
                            multiply(new BigDecimal(nights).multiply(new BigDecimal(0.70)));
                    apartamentRent = apartamentPrice.
                            multiply(new BigDecimal(nights).multiply(new BigDecimal(0.90)));
                } else if (nights > 7) {
                    studioRent = studioPrice.
                            multiply(new BigDecimal(nights).multiply(new BigDecimal(0.95)));
                    apartamentRent = apartamentPrice.multiply(new BigDecimal(nights));
                } else {
                    studioRent = studioPrice.multiply(new BigDecimal(nights));
                    apartamentRent = apartamentPrice.multiply(new BigDecimal(nights));
                }
                break;
            case "June":
            case "September":
                studioPrice = new BigDecimal(75.20);
                apartamentPrice = new BigDecimal(68.70);
                if (nights > 14) {
                    studioRent = studioPrice.
                            multiply(new BigDecimal(nights).multiply(new BigDecimal(0.80)));
                    apartamentRent = apartamentPrice.
                            multiply(new BigDecimal(nights).multiply(new BigDecimal(0.90)));
                } else {
                    studioRent = studioPrice.multiply(new BigDecimal(nights));
                    apartamentRent = apartamentPrice.multiply(new BigDecimal(nights));
                }
                break;
            case "July":
            case "August":
                studioPrice = new BigDecimal(76.00);
                apartamentPrice = new BigDecimal(77.00);
                if (nights > 14) {
                    studioRent = studioPrice.multiply(new BigDecimal(nights));
                    apartamentRent = apartamentPrice.multiply(new BigDecimal(nights).multiply(new BigDecimal(0.90)));
                } else {
                    studioRent = studioPrice.multiply(new BigDecimal(nights));
                    apartamentRent = apartamentPrice.multiply(new BigDecimal(nights));
                }
                break;
            default:
                break;
        }
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        String studioInfo = String.format("Studio: %s lv.",
                decimalFormatter.format(
                        studioRent.setScale(2, RoundingMode.HALF_UP)));
        String apartamentInfo = String.format("Apartment: %s lv.",
                decimalFormatter.format(
                        apartamentRent.setScale(2, RoundingMode.HALF_UP)));
        System.out.println(apartamentInfo);
        System.out.println(studioInfo);
    }
}
