package org.example.testable;

public class Testability {

    private Logger logger;
    private MailSender mailSender;

    public Testability(Logger logger, MailSender mailSender) {
        this.logger = logger;
        this.mailSender = mailSender;
    }

    public static void main(String[] args) {
        new Testability(new RealLogger(), new RealMailSender()).run();
    }

    public void run() {
        try {
            logger.log(LogLevel.WARNING, "Some warning - program is starting up or whatever");
            mailSender.sendMail("some-invalid-email-address.com", "Program has started.");
        } catch (IllegalArgumentException ex) {
            logger.log(LogLevel.ERROR, "An error occured: " + ex);
        }
    }
}

