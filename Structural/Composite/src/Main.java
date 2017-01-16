/**
 * Created by den on 2017-01-16.
 */
public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        team.addDeveloper(new CppDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());

        team.work();
    }
}
