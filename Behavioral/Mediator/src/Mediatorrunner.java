/**
 * Created by den on 2017-01-19.
 */
public class Mediatorrunner {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"User 1");
        User user2 = new SimpleUser(chat,"User 2");
        chat.setAdmin(admin);


        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello!");
        admin.sendMessage("Understand!");
    }
}
