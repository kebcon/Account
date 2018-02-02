package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
@Autowired
    private AccountServices accountServices;

    @RequestMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountServices.getAllAccounts();
    }

    @RequestMapping("/accounts/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountServices.getAccount(id);
    }
    @RequestMapping("/customers/{customer_Id}/accounts")
    public Account getCustomerAccountById(@PathVariable Long customer_Id){
        return accountServices.getCustomerAccountById(customer_Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customer_Id}/accounts")
    public void addAccount(@RequestBody Account account, @PathVariable Long customer_Id){
        accountServices.addAccount(account, customer_Id);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/accounts/{account_id}")
    public void updateAccount(@RequestBody Account account, @PathVariable Long account_id){
        accountServices.updateAccount(account,account_id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{account_id}")
    public void deleteAccount(@PathVariable Account account_id){
        accountServices.deleteAccount(account_id);
    }
}
