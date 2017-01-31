/**
 * Created by den on 2017-01-31.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
