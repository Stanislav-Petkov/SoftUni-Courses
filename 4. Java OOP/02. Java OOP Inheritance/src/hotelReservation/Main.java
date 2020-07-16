package hotelReservation;

import hotelReservation.domain.Reservation;
import hotelReservation.io.InputDataReservationParser;
import hotelReservation.io.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        InputDataReservationParser parser = new InputDataReservationParser();
        Reservation reservation = parser.parseFromLine(line);

        double price = reservation.calculatePrice();

        Printer printer = new Printer(System.out);
        printer.getRoundedValue(price);
    }
}
