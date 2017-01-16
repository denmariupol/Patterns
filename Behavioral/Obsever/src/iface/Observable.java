package iface;

/**
 * Created by den on 2017-01-03.
 */
public interface Observable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
