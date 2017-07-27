package by.tc.example.service.impl;

import by.tc.example.bean.User;
import by.tc.example.repository.UserRepository;
import by.tc.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User fidUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

}