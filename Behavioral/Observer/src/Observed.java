/**
 * Created by den on 2017-01-31.
 */
public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
