/**
 * Created by den on 2017-01-31.
 */
public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}