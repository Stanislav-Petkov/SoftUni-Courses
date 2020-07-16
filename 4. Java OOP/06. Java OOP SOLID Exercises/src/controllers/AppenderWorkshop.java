package controllers;

import enums.ReportLevel;
import interfaces.Appender;
import interfaces.AppenderFactory;
import interfaces.Layout;

import java.io.IOException;

public class AppenderWorkshop implements AppenderFactory {
    @Override
    public Appender produce(String type, ReportLevel reportLevel, Layout layout) throws IOException {
        return switch (type) {
            case "ConsoleAppender" -> new ConsoleAppender(reportLevel, layout);
            case "FileAppender" -> new FileAppender(reportLevel, layout);
            case "SocketAppender" -> new SocketAppender(reportLevel, layout);
            default -> throw new IllegalStateException(
                    "Not valid type of appender for " + type + " param");
        };
    }
}
