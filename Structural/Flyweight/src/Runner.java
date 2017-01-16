import java.util.ArrayList;
import java.util.List;

/**
 * Created by den on 2017-01-17.
 */
public class Runner {
    public static void main(String[] args) {
        DevFactory devFactory = new DevFactory();
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(devFactory.hireDeveloper("java"));
        developers.add(devFactory.hireDeveloper("java"));
        developers.add(devFactory.hireDeveloper("java"));
        developers.add(devFactory.hireDeveloper("c++"));
        developers.add(devFactory.hireDeveloper("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
