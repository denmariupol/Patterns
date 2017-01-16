import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by den on 2017-01-16.
 */
public class DevFactory {
    private Map<String,Developer> developers = new HashMap<String,Developer>();

    public Developer hireDeveloper(String specialty){
        Developer developer = developers.get(specialty);

        if(developer == null){
            switch (specialty){
                case "java":
                    developer = new JavaDeveloper();
                    System.out.println("Hiring java developer");
                    break;
                case "c++":
                    developer = new CppDeveloper();
                    System.out.println("Hiring c++ developer");
                    break;
                default:
                    throw new NotImplementedException();
            }
            developers.put(specialty,developer);
        }
        return developer;
    }


}
