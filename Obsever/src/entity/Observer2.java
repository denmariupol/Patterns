package entity;

import iface.Observer;

/**
 * Created by den on 2017-01-05.
 */
public class Observer2 implements Observer {
    private int count;
    @Override
    public void update(int count) {
        this.count = count;
        System.out.println("Observer1 count: "+count);
    }
    @Override
    public String toString(){
        return this.getClass().toString();
    }
}
