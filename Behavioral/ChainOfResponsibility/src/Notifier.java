/**
 * Created by den on 2017-01-17.
 */
public abstract class Notifier {
    private int priority;
    private Notifier nextnotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextnotifier(Notifier nextnotifier) {
        this.nextnotifier = nextnotifier;
    }

    public void notifyManager(int level,String message){
        if(level >=priority)
            write(message);
        if(nextnotifier != null)
            nextnotifier.notifyManager(level,message);
    }

    public abstract void write(String message);
}
