package lesson_5.command;

public class UpdateCommand implements Command{
    Sending sending;

    public UpdateCommand(Sending sending) {
        this.sending = sending;
    }

    @Override
    public void execute(){
        sending.update();
    }
}
