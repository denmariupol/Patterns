/**
 * Created by den on 2017-01-31.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(junior);

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Senior in action");
        project.beWritten(senior);
    }
}
