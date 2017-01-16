import entity.Observer1;
import entity.Observer2;
import entity.Subject;

/**
 * Created by den on 2017-01-03.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        for (int i = 0; i < 10; i++) {
            subject.setCount(i);
            subject.notifyObservers();
            if(i == 2)
                subject.removeObserver(observer1);
            if(i == 4)
                subject.removeObserver(observer2);
            if (i == 6)
                subject.registerObserver(observer2);
            if (i == 8)
                subject.registerObserver(observer1);
        }



    }
}
