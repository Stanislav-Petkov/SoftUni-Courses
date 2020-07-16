package hotelReservation.io;

import hotelReservation.domain.Discount;
import hotelReservation.domain.Reservation;
import hotelReservation.domain.Season;

public class InputDataReservationParser {

    //50.25 5 Summer VIP
    public Reservation parseFromLine(String line) {
        String[] tokens = line.split("\\s+");
        double pricePerDay = Double.valueOf(tokens[0]);
        int numberOfDays = Integer.valueOf(tokens[1]);
        Season season = Season.valueOf(tokens[2].toUpperCase());
        Discount discoutType = Discount.valueOf(tokens[3].toUpperCase());

        return new Reservation(pricePerDay, numberOfDays,
                season, discoutType);
    }
}
