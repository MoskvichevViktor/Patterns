package lesson_5.command;

public class DeleteCommand implements Command{
    Sending sending;

    public DeleteCommand(Sending sending) {
        this.sending = sending;
    }

    @Override
    public void execute(){
        sending.delete();
    }
}
