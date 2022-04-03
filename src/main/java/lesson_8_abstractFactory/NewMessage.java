package lesson_8_abstractFactory;

public class NewMessage implements Message {
    @Override
    public void writeMessage(){
        System.out.println("NEW MESSAGE!");
    }

}
