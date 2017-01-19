import java.util.Date;

/**
 * Created by den on 2017-01-19.
 */
public class Project {
    String version;
    Date date;


    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        this.version = save.getVersion();
        this.date = save.getDate();
    }

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }
    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
