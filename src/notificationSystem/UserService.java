package notificationSystem;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userList;
    public UserService() {
        userList=new ArrayList<User>();
        userList.add(new User("sagar","sagar@gamil.com","8766744"));
        userList.add(new User("suhani","suhani@gmail.com","914697"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
