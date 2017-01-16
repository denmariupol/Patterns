/**
 * Created by den on 2017-01-14.
 */
public class Logger {
    private static Logger logger = new Logger();
    private StringBuilder sb = new StringBuilder("Log file \n\n");

    private Logger(){}
    public static Logger getLogger(){
        return logger;
    }

    public void AddLog(String log){
        sb.append(log).append("\n");
    }

    @Override
    public String toString(){
        return sb.toString();
    }
}
