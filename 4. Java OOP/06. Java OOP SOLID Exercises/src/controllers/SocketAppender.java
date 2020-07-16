package controllers;

import enums.ReportLevel;
import interfaces.Layout;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketAppender extends AbstractAppender {
    private Socket socket;

    public SocketAppender(ReportLevel reportLevel, Layout layout) throws IOException {
        super(reportLevel, layout);
        socket = new Socket("localhost", 21);
    }

    @Override
    protected String getType() {
        return "SocketAppender";
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String output = this.getLayout().format(date, reportLevel, message);
        try {
            OutputStream outputStream = this.socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(outputStream));
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}










