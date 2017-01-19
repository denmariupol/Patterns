import java.util.Date;

/**
 * Created by den on 2017-01-19.
 */
public class Save {
    private String version;
    private Date date;

    public Save(String version){
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
