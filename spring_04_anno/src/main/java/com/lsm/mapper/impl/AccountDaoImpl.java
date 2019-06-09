package com.lsm.mapper.impl;

import com.lsm.mapper.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("数据保存了！");
    }
}
