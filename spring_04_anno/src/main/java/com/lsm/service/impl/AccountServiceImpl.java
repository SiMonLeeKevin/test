package com.lsm.service.impl;

import com.lsm.mapper.impl.AccountDaoImpl;
import com.lsm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDaoImpl accountDao;

    /*public AccountServiceImpl(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }*/

    public void saveAccount() {
    accountDao.saveAccount();
    }
}
