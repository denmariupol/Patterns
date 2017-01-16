/**
 * Created by den on 2017-01-16.
 */
public class Teamlead extends Decorator {

    public Teamlead(Developer developer) {
        super(developer);
    }

    @Override
    public String work() {
        return developer.work()+ sendResults();
    }

    private String sendResults() {
        return ",send results";
    }
}
