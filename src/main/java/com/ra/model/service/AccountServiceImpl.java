package com.ra.model.service;

import com.ra.model.entity.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    private static List<Account> list = new ArrayList<>();
    @Override
    public List<Account> findAll() {
        list.add(new Account(1,"ABC","a@ggmail.com","12312"));
        list.add(new Account(2,"C","a@ggmail.com","12312"));
        list.add(new Account(3,"BC","a@ggmail.com","12312"));

        return list;
    }

    @Override
    public Boolean create(Account account) {
        return null;
    }

    @Override
    public Boolean update(Account account, Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Account findId(Integer integer) {
        return null;
    }
}
