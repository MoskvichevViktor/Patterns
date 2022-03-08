package lesson_5.command;

public class InsertCommand implements Command{
    Sending sending;

    public InsertCommand(Sending sending) {
        this.sending = sending;
    }

    @Override
    public void execute(){
        sending.insert();
    }
}
