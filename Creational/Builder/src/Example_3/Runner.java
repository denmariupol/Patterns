package Example_3;

/**
 * Created by den on 2017-01-15.
 */
public class Runner {
    public static void main(String[] args) {
        Builder builder = new Builder(new LandingPage());
        Website website = builder.buildWebsite();

        System.out.println(website);
    }
}
