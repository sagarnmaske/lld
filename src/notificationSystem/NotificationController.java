package notificationSystem;

public class NotificationController {

    private UserService userService;

    public NotificationController(UserService userService) {
        this.userService = userService;
    }

    public void getNotification(String message) {
        if(message==null || message.isEmpty()) {
            System.out.println("Invalid Notification");
            return;
        }

        NotificationService emailNotificationService = new NotificationService(userService,new EmailNotificationSender());
        emailNotificationService.sendNotification(message);
        NotificationService smsNotificationService = new NotificationService(userService,new SMSNotificationSender());
        smsNotificationService.sendNotification(message);

    }
}
