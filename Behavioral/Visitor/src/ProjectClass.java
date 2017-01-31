/**
 * Created by den on 2017-01-31.
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
