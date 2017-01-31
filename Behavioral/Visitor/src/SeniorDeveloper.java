/**
 * Created by den on 2017-01-31.
 */
public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting classs after Junior");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing Database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Making reliable tests");
    }
}
