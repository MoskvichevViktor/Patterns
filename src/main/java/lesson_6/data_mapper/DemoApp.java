package lesson_6.data_mapper;

import java.util.Optional;

public final class DemoApp {

    public static void main(final String...args) {

        final UserDataMapper mapper = new UserDataMapperImpl();
        User user = new User(1, "Bob");
        mapper.insert(user);

        final Optional<User> userToBeFound = mapper.find(user.getUserId());

        user = new User(user.getUserId(), "Updated");
        mapper.update(user);
        mapper.delete(user);


    }
}
