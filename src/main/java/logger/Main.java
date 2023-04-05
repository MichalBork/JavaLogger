package logger;
import notify.handlers.DiscordNotification;
import notify.handlers.MailNotification;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger.Builder()
                .addNotificationStrategy(new MailNotification("example@example.com", "password"))
                .addNotificationStrategy(new DiscordNotification("discord-webhook-url"))
                .build();

        logger.log("Something happened! No i trudno :D");
    }

}
