package by.tc.test.service.impl;

import by.tc.test.entity.User;
import by.tc.test.repository.UserRepository;
import by.tc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByMobile(String mobile) {
        return userRepository.findUserByMobile(mobile);
    }
}