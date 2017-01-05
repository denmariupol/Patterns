package entity;

import iface.Observable;
import iface.Observer;

/**
 * Created by den on 2017-01-03.
 */
public class Observer1 implements Observer{
    private int count;


    @Override
    public void update(int count) {
        this.count = count;
        System.out.println("Observer1 count: "+count);
    }

    public String toString(){
        return this.getClass().toString();
    }

}
