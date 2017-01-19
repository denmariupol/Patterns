/**
 * Created by den on 2017-01-20.
 */
public class MementoRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating project...");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving project...");
        github.setSave(project.save());
        Thread.sleep(2000);

        System.out.println("Updating project...");
        project.setVersionAndDate("Version 2.0");
        System.out.println(project);
        Thread.sleep(2000);

        System.out.println("Unroll project...");
        project.load(github.getSave());
        System.out.println(project);
    }
}
