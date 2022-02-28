package lesson_3.factory;

public class MessageSendingFactory implements SendingFactory{
    @Override
    public Sending createSending() {
        return new MessageSending();
    }

}
