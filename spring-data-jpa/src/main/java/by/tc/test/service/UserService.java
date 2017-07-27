package by.tc.test.service;

import by.tc.test.entity.User;

import java.util.List;

public interface UserService {

    User findUserByLogin(String login);

    List<User> findAllUsers();

    User save(User user);

    User saveAndFlush(User user);

}