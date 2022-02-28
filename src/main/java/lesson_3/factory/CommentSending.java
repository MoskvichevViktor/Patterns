package lesson_3.factory;

public class CommentSending implements Sending{
    @Override
    public void send(){
        System.out.println("SEND COMMENT");
    }
}
