/**
 * Created by den on 2017-01-17.
 */
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("We have a problem!!!"+message);
    }
}
