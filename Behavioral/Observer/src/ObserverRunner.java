/**
 * Created by den on 2017-01-31.
 */
public class ObserverRunner {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("Java Developer");

        Observer firstSubscriber = new Subscriber("Den");
        Observer secondSubscriber = new Subscriber("Paul");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Junior Android");

        site.removeVacancy("Junior Android");
    }
}
