package lesson_3.factory;

public class MessageSending implements Sending{
    @Override
    public void send(){
        System.out.println("SEND MESSAGE");
    }
}
