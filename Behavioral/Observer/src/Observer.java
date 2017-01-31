import java.util.List;

/**
 * Created by den on 2017-01-31.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
