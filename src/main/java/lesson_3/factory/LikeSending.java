package lesson_3.factory;

public class LikeSending implements Sending{

    @Override
    public void send(){
        System.out.println("SEND LIKE");
    }
}
