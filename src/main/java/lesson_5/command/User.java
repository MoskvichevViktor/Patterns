package lesson_5.command;

public class User {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public User(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertSending(){
        insert.execute();
    }

    public void updateSending(){
        update.execute();
    }

    public void selectSending(){
        select.execute();
    }

    public void deleteSending(){
        delete.execute();
    }
}
