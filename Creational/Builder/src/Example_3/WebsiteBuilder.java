package Example_3;

/**
 * Created by den on 2017-01-15.
 */
public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite(){
        website = new Website();
    }

    public abstract void setName();
    public abstract void setPrice();

    public abstract Website getWebsite();
}
