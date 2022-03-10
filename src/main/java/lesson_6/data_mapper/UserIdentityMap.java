package lesson_6.data_mapper;

import java.util.HashMap;
import java.util.Map;

public class UserIdentityMap {

    private static Map<Long, User> userMap = new HashMap<>();

    // добавить товар в IdentityMap
    public static void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    // пролучить продукт по ключу
    public static User getUser(Long key) {
        return (User) userMap.get(key);
    }

    // удалить продукт из IdentityMap по ключу и вернуть удаленный объект
    public static User removeUser(Long key) {
        User user = userMap.get(key);
        userMap.remove(key);
        return user;
    }
}
