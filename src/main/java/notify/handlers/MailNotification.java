package notify.handlers;


import notify.NotificationStrategy;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailNotification implements NotificationStrategy {
    private final String emailAddress;

    private final String password;

    public MailNotification(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public void sendNotification(String message) {
        try {
            sendMail(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private void sendMail(String message2) throws MessagingException {  // Recipient's email ID needs to be mentioned.


    }

//
//    Session session = Session.getInstance(this.mailSenderFactory);


}
