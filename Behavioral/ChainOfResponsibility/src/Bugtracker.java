/**
 * Created by den on 2017-01-17.
 */
public class Bugtracker {
    public static void main(String[] args) {
        SimpleNotifier simpleNotifier = new SimpleNotifier(Priority.NORMAL);
        EmailNotifier emailNotifier = new EmailNotifier(Priority.AVERAGE);
        SMSNotifier smsNotifier = new SMSNotifier(Priority.HIGH);

        simpleNotifier.setNextnotifier(emailNotifier);
        emailNotifier.setNextnotifier(smsNotifier);

//        simpleNotifier.notifyManager(Priority.NORMAL," OK!");
//        simpleNotifier.notifyManager(Priority.AVERAGE," Look out!");
        smsNotifier.notifyManager(Priority.HIGH," Big trouble!");
    }
}
