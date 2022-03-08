package lesson_5.command;

public class SelectCommand implements Command{
    Sending sending;

    public SelectCommand(Sending sending) {
        this.sending = sending;
    }

    @Override
    public void execute(){
        sending.select();
    }
}
