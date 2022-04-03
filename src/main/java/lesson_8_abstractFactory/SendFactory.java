package lesson_8_abstractFactory;

public interface SendFactory {
    Comment getComment();
    Message getMessage();
    Like getLike();
}
