package notify;

public class NotificationContext  {
    private NotificationStrategy notificationStrategy;

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(String message) {
        notificationStrategy.sendNotification(message);
    }
}
