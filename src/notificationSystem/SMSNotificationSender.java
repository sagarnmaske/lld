package notificationSystem;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("SMS Notification sent to:" + notification.getUser().getMobile());
        notification.getUser().acceptNotification(notification.getMessage());
    }
}
