package hotelReservation.io;

import java.io.PrintStream;

public class Printer {

    PrintStream out;

    public Printer(PrintStream out) {
        this.out = out;
    }

    public void getRoundedValue(double dbl) {
        String rounderDouble = String.format("%.2f", dbl);
        out.println(rounderDouble);
    }
}
