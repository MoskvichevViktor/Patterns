package lesson_8_abstractFactory;

public class NewLike implements Like {
    @Override
    public  void writeLike(){
        System.out.println("NEW LIKE!");
    }
}
