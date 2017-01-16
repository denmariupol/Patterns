/**
 * Created by den on 2017-01-16.
 */
public class Portal extends Website {

    public Portal(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void buildSite() {
        System.out.println("Portal is building...");
        developer.createSite();
    }
}
