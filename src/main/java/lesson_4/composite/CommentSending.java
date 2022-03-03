package lesson_4.composite;

public class CommentSending implements Sending {
    @Override
    public void send(){
        System.out.println("SEND COMMENT");
    }
}
