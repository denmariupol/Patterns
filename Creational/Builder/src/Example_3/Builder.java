package Example_3;

/**
 * Created by den on 2017-01-15.
 */
public class Builder {
    WebsiteBuilder builder;

    public Builder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite(){
        builder.createWebsite();
        builder.setName();
        builder.setPrice();

        return builder.getWebsite();
    }


}
