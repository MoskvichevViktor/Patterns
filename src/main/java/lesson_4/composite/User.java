package lesson_4.composite;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Sending> sendings = new ArrayList<>();

    public void addSending(Sending sending){
        sendings.add(sending);
    }

    public void removeSending(Sending sending){
        sendings.remove(sending);
    }

    public void createUser(){
        System.out.println("New User send greetings!");
        for(Sending sending: sendings){
            sending.send();
        }
    }

}
