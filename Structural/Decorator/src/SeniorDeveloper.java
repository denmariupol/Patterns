/**
 * Created by den on 2017-01-16.
 */
public class SeniorDeveloper extends Decorator{

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    private String inspectCode(){
        return ",inspect code";
    }

    @Override
    public String work() {
        return developer.work()+ inspectCode();
    }
}
