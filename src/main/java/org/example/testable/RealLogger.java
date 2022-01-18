package org.example.testable;

public class RealLogger implements Logger {
    private MailSender mailSender;

    @Override
    public void log(LogLevel logLevel, String logText) {
        System.out.println(logLevel + ": " + logText);

        if (logLevel == LogLevel.ERROR) {
            //send e-mail about error
            mailSender.sendMail("kalle.anka@ankeborg.se", logText);
        }
    }
}
