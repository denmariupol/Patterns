package Example_3;

/**
 * Created by den on 2017-01-15.
 */
public class LandingPage extends WebsiteBuilder {
    @Override
    public void setName() {
        website.setName("Landing Page Site");
    }

    @Override
    public void setPrice() {
        website.setPrice(1000);
    }

    @Override
    public Website getWebsite() {
        return website;
    }
}
