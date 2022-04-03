package lesson_8_abstractFactory;

public class NewComment implements Comment {
    @Override
    public void writeComment(){
        System.out.println("NEW COMMENT!");
    }
}
