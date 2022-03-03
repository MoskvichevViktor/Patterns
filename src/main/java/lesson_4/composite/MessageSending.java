package lesson_4.composite;

public class MessageSending implements Sending {
    @Override
    public void send(){
        System.out.println("SEND MESSAGE");
    }
}
