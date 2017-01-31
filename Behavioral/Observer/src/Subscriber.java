import java.util.List;

/**
 * Created by den on 2017-01-31.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+ name +" we have some changes in vacancies: \n"+vacancies+ "\n");
    }
}
