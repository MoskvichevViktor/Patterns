package lesson_3.factory;

public class CommentSendingFactory implements SendingFactory {
    @Override
    public Sending createSending() {
        return new CommentSending();
    }
}
