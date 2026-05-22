package notificationSystem;

public class Notification {
    private final String message;
    private final User user;

    public Notification(String message, User user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
