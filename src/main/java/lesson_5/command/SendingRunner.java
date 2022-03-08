package lesson_5.command;

public class SendingRunner {
    public static void main(String[] args) {
        Sending sending = new Sending();

        User user = new User(
                new InsertCommand(sending),
                new UpdateCommand(sending),
                new SelectCommand(sending),
                new DeleteCommand(sending)
        );

        user.insertSending();
        user.updateSending();
        user.selectSending();
        user.deleteSending();
    }
}
