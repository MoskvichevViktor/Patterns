package lesson_8_abstractFactory;

public class Main {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactoryImpl();
        Comment comment = sendFactory.getComment();
        Message message = sendFactory.getMessage();
        Like like = sendFactory.getLike();

        System.out.println("Creating new send: ");
        comment.writeComment();
        message.writeMessage();
        like.writeLike();

    }
}
