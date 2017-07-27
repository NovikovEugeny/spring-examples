package by.tc.test.service.impl;

import by.tc.test.entity.SuperUser;
import by.tc.test.repository.SuperUserRepository;
import by.tc.test.service.SuperUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperUserServiceImpl implements SuperUserService {

    @Autowired
    private SuperUserRepository superUserRepository;

    @Override
    public List<SuperUser> findAll() {
        return superUserRepository.findAll();
    }

}