package com.lsm.controller.impl;

import com.lsm.controller.IAccountController;
import com.lsm.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController implements IAccountController {
    @Autowired
    private AccountServiceImpl accountService;

    /*public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }*/

    public void saveAccount() {
        accountService.saveAccount();
    }
}
