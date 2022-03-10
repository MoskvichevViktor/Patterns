package lesson_6.data_mapper;

import java.util.Optional;

public interface UserDataMapper {

    Optional<User> find(Long userId);

    void insert(User user) throws DataMapperException;

    void update(User newUser) throws DataMapperException;

    void delete(User user) throws DataMapperException;
}
