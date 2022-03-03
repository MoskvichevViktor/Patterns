package lesson_4.composite;

public class SocialNetwork {
    public static void main(String[] args) {
        User user = new User();

        Sending comment = new CommentSending();
        Sending like = new LikeSending();
        Sending message = new MessageSending();

        user.addSending(comment);
        user.addSending(like);
        user.addSending(message);

        user.createUser();

    }
}
