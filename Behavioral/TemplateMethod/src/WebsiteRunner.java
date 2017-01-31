/**
 * Created by den on 2017-01-31.
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();


        welcomePage.showPage();

        System.out.println("----------------------------");
        newsPage.showPage();
    }
}
