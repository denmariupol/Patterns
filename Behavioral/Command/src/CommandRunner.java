/**
 * Created by den on 2017-01-14.
 */
public class CommandRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer( new InsertCommand(database),new SelectCommand(database),
                new UpdateCommand(database),new DeleteCommand(database));

        developer.insertCommand();
        developer.selectCommand();
        developer.updateCommand();
        developer.deleteCommand();
    }
}
