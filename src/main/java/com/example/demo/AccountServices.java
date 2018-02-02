package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServices {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public Account getAccount(Long id) {

        return accountRepository.findOne(id);
    }

        public Account getCustomerAccountById(Long customer_Id) {

        return accountRepository.findOne(customer_Id);
    }

    public void addAccount(Account account, Long customer_Id) {

        accountRepository.save(account);
    }

    public void updateAccount(Account account, Long account_id) {

        accountRepository.save(account);
    }

    public void deleteAccount(Account account_id ) {
        accountRepository.delete(account_id);
    }




}
