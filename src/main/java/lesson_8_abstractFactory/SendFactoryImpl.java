package lesson_8_abstractFactory;

public class SendFactoryImpl implements SendFactory {
    @Override
    public Comment getComment(){
        return  new NewComment();
    }

    @Override
    public Message getMessage(){
        return  new NewMessage();
    }

    @Override
    public Like getLike(){
        return  new NewLike();
    }
}
