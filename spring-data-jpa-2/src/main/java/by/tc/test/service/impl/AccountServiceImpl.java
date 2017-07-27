package by.tc.test.service.impl;

import by.tc.test.entity.Account;
import by.tc.test.repository.AccountRepository;
import by.tc.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findAccountById(int id) {
        return accountRepository.findAccountById(id);
    }

}