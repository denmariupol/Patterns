/**
 * Created by den on 2017-01-17.
 */
public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Something happened!!"+message);
    }
}
