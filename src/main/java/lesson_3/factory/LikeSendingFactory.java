package lesson_3.factory;

public class LikeSendingFactory implements SendingFactory{
    @Override
    public Sending createSending() {
        return new LikeSending();
    }

}
