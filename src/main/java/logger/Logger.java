package logger;

import notify.NotificationContext;
import notify.NotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class Logger implements LoggerInterface {

    private final NotificationContext notificationContext;
    private List<NotificationStrategy> notificationStrategies;
    private String message;

    public Logger() {
        notificationContext = new NotificationContext();
        notificationStrategies = new ArrayList<>();
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        notificationContext.setNotificationStrategy(notificationStrategy);
    }

    @Override
    public void log(String message) {
        setMessage(message);
        sendNotification();
    }

    @Override
    public void logLevel(LogLevel level) {
        setMessage("LogLevel: " + level.toString());
        sendNotification();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addNotificationStrategy(NotificationStrategy notificationStrategy) {
        notificationStrategies.add(notificationStrategy);
    }

    public void removeNotificationStrategy(NotificationStrategy notificationStrategy) {
        notificationStrategies.remove(notificationStrategy);
    }

    public void sendNotification() {
        for(NotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(message);
        }
    }

    public static class Builder {
        private final List<NotificationStrategy> notificationStrategies = new ArrayList<>();
        private String message;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder addNotificationStrategy(NotificationStrategy notificationStrategy) {
            notificationStrategies.add(notificationStrategy);
            return this;
        }

        public Logger build() {
            Logger logger = new Logger();
            logger.notificationStrategies = notificationStrategies;
            logger.message = message;
            return logger;
        }
    }
}
