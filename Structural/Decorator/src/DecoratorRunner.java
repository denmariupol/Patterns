/**
 * Created by den on 2017-01-16.
 */
public class DecoratorRunner {
    public static void main(String[] args) {
        Developer developer = new Teamlead(new SeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.work());
    }
}
