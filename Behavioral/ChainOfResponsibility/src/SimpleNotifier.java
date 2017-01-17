/**
 * Created by den on 2017-01-17.
 */
public class SimpleNotifier extends Notifier {
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Keep calm!"+message);
    }
}
