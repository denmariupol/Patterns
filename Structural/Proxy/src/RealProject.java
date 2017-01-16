/**
 * Created by den on 2017-01-17.
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Realproject is loading...");
    }
    @Override
    public void run() {
        System.out.println("Realproject is running...");
    }
}
