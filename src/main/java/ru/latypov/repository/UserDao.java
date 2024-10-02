package ru.latypov.repository;

import ru.latypov.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void deleteById(Long id);

    void update(User user, Long id);
}
