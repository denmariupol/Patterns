import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by den on 2017-01-16.
 */
public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void work() {
        for (Developer developer : developers) {
            developer.working();
        }
    }
}
