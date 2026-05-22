package notificationSystem;

public class NotificationService {
    private final UserService userService;
    private final NotificationSender notificationSender;

    public NotificationService(UserService userService, NotificationSender notificationSender) {
        this.userService = userService;
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        for (User user : userService.getUserList()) {
            notificationSender.sendNotification(new Notification(message, user));
        }
    }
}
