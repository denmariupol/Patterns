/**
 * Created by den on 2017-01-16.
 */
public class LandingPage extends Website {

    public LandingPage(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void buildSite() {
        System.out.println("Landing page is creating...");
        developer.createSite();
    }
}
