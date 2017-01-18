/**
 * Created by den on 2017-01-18.
 */
public class Developer {
    Command insert,update,delete,select;

    public Developer(Command insert, Command update, Command delete, Command select) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
        this.select = select;
    }

    public void insertCommand(){
        insert.execute();
    }

    public void updateCommand(){
        update.execute();
    }
    public void selectCommand(){
        select.execute();
    }
    public void deleteCommand(){
        delete.execute();
    }
}
