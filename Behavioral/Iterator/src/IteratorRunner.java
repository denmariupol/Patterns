/**
 * Created by den on 2017-01-19.
 */
public class IteratorRunner {
    public static void main(String[] args) {
        String name = "Den";
        String[] skills = {"Java SE","Hibernate","JSP","Servlets","Android"};

        Developer developer = new Developer(name,skills);
        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
