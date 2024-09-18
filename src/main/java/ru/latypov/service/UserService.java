package ru.latypov.service;

import ru.latypov.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserById(Long id);

    void save(User user);

    void delete(Long id);

    void update(User user, Long id);
}
