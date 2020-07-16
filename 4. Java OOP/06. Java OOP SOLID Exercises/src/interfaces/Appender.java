package interfaces;

import enums.ReportLevel;

import java.io.IOException;

public interface Appender {
    void append(String date, ReportLevel reportLevel, String message) ;
    ReportLevel getReportLevel();
}
