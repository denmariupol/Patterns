/**
 * Created by den on 2017-01-16.
 */
public class Main {
    public static void main(String[] args) {
        Website[] websites = {
            new LandingPage(new JavaDeveloper()),
            new Portal(new CppDeveloper())
        };

        for (Website website : websites) {
            website.buildSite();
        }
    }
}
