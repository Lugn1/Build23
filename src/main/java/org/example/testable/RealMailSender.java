package org.example.testable;

public class RealMailSender implements MailSender {
    @Override
    public void sendMail(String recipient, String content) {
        if (!recipient.contains("@"))
            throw new IllegalArgumentException("The recipient must be a valid e-mail.");

        //for the sake of simplicity, this actually doesn't send an e-mail right now - but let's pretend it does.
        System.out.println("Sent e-mail to " + recipient + " with content \"" + content + "\"");
    }
}
