package dependencyInversion.busines;

import dependencyInversion.ui.Formatter;

import java.time.LocalDateTime;

public class CurrentTimeAppendingFormatter implements Formatter {
    @Override
    public String format(String input) {
        return String.format("[%s] %s",
                LocalDateTime.now(), input);
    }
}
