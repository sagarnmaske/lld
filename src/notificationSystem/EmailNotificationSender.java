package notificationSystem;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Email Notification sent to:" + notification.getUser().getEmail());
        notification.getUser().acceptNotification(notification.getMessage());
    }
}
