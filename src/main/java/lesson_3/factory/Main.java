package lesson_3.factory;

public class Main {

    static SendingFactory createSendingChose(String chose){
        if(chose.equalsIgnoreCase("like")){
            return new LikeSendingFactory();
        }else if(chose.equalsIgnoreCase("comment")){
            return new LikeSendingFactory();
        }else if(chose.equalsIgnoreCase("message")) {
            return new LikeSendingFactory();
        }else {
            throw new RuntimeException(chose + " is unKnown chose");
            }
    }

    public static void main(String[] args) {
        SendingFactory sendingFactory = createSendingChose("like");
        Sending sending = sendingFactory.createSending();
        sending.send();

    }
}
