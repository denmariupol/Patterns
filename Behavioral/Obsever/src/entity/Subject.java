package entity;

import iface.Observable;
import iface.Observer;

import java.util.ArrayList;

/**
 * Created by den on 2017-01-03.
 */
public class Subject implements Observable{

    private ArrayList<Observer> observers;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public Subject(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        System.out.println("Removing :"+o.toString());
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removing :"+o.toString());
        int i = observers.indexOf(o);
        if (i >=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(count);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int count){
        this.count = count;
        measurementsChanged();
    }
}
