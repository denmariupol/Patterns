/**
 * Created by den on 2017-01-17.
 */
public class ProxyRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://github.com/denmariupol/project/");
        project.run();
    }
}
