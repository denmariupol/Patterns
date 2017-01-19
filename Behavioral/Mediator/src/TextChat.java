import java.util.ArrayList;
import java.util.List;

/**
 * Created by den on 2017-01-19.
 */
public class TextChat implements Chat {
    List<User> users = new ArrayList<User>();
    User admin;

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1 : users) {
            if(user1 != user)
                user1.receiveMessage(message);
        }
        admin.receiveMessage(message);
    }
}
