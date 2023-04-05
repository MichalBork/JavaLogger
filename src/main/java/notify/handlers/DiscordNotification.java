package notify.handlers;

import notify.NotificationStrategy;

public class DiscordNotification implements NotificationStrategy {
    private final String webhookUrl;

    public DiscordNotification(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public void sendNotification(String message) {
        sendDiscordMessage(message);
    }

    private void sendDiscordMessage(String message) {
        System.out.println("Sending discord message to " + webhookUrl + " with message: " + message);
    }
}
