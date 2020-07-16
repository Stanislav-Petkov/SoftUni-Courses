package dependencyInversion.busines;

import dependencyInversion.ui.Formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrettyCurrentTimeAppendingFormatter implements Formatter {
    private DateTimeFormatter formatter;

    public PrettyCurrentTimeAppendingFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String format(String input) {
        return String.format("[%s] %s",
                LocalDateTime.now().format(formatter), input);
    }
}
