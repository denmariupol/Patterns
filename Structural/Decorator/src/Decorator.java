/**
 * Created by den on 2017-01-16.
 */
public abstract class Decorator implements Developer{
    Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

}
