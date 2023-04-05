package notify.handlers;

import notify.NotificationStrategy;

public class SlackNotification implements NotificationStrategy {
    private final String webhookUrl;

    public SlackNotification(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    @Override
    public void sendNotification(String message) {
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending slack message to " + webhookUrl + " with message: " + message);
    }

}
