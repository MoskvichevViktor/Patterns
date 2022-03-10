package lesson_6.data_mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class UserDataMapperImpl implements UserDataMapper {

    // имитация базы данных
    private List<User> users = new ArrayList<>();

    private UserIdentityMap userMap = new UserIdentityMap();

    @Override
    public Optional<User> find(Long userId) {

        // проверяем IdentityMap
        User user = userMap.getUser(userId);
        if (user == null) {
            // достаем товар из базы данных (имитация, поэтому в цикле)
            for (final User userFromDB : this.getUsers()) {
                if (userFromDB.getUserId() == userId) {
                    // если есть результат, то добавляем товар в IdentityMap
                    userMap.addUser(user);
                    // возвращаем результат
                    return Optional.of(user);
                }
            }
        }
        // если товар не найден - возвращается пустой Optional
        return Optional.empty();
    }

    @Override
    public void update(User userToBeUpdated) throws DataMapperException {

        User user = userMap.getUser(userToBeUpdated.getUserId());
        if (user != null) {
            // удаляем из IdentityMap
            userMap.removeUser(userToBeUpdated.getUserId());
        }


        // поиск в базе
        if (this.getUsers().contains(userToBeUpdated)) {
            final int index = this.getUsers().indexOf(userToBeUpdated);
            this.getUsers().set(index, userToBeUpdated);
            userMap.addUser(userToBeUpdated); // добавить в IdentityMap
        } else {
            throw new DataMapperException("User [" + userToBeUpdated.getName() + "] is not found");
        }
    }

    @Override
    public void insert(User userToBeInserted) throws DataMapperException {
        User user = userMap.getUser(userToBeInserted.getUserId());
        if (user == null && !this.getUsers().contains(userToBeInserted)) {
            this.getUsers().add(userToBeInserted);
            userMap.addUser(userToBeInserted); // добавить в IdentityMap
        } else {
            throw new DataMapperException("User [" + userToBeInserted.getName() + "] already exists");
        }
    }

    @Override
    public void delete(User userToBeDeleted) throws DataMapperException {
        User user = userMap.getUser(userToBeDeleted.getUserId());
        if (user != null) {
            userMap.removeUser(userToBeDeleted.getUserId());
        }

        if (this.getUsers().contains(userToBeDeleted)) {
            this.getUsers().remove(userToBeDeleted);
        } else {
            throw new DataMapperException("User [" + userToBeDeleted.getName() + "] is not found");
        }
    }

    public List <User> getUsers() {
        return this.users;
    }
}
