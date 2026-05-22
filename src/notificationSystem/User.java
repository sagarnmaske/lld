package notificationSystem;

public class User {
    private String username;
    private String email;
    private String mobile;

    public User(String username, String email, String mobile) {
        this.username = username;
        this.email = email;
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void acceptNotification(String message) {
        System.out.println(getUsername() + " accepted notification: " + message);
    }
}
