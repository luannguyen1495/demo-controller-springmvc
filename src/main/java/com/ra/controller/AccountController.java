package com.ra.controller;

import com.ra.model.entity.Account;
import com.ra.model.service.AccountService;
import com.ra.model.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AccountController {
//    private AccountService accountService = new AccountServiceImpl();
    @Autowired
    private  AccountService accountService;
    @RequestMapping("/account")
    public String index(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "account";
    }

    @RequestMapping("/register")
    public String register(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        return "register";
    }
    @RequestMapping("/postRegister")
    public String postRegister(@ModelAttribute("account") Account account){
        System.out.println(account.getUserName());
        System.out.println(account.getPassword());
        return "thanks";
    }
    /*
    @RequestMapping("/edit-account")
    public String edit(@RequestParam("id") Integer id){
        System.out.println(id);
        return "thanks";
    }
    */
    @RequestMapping("/edit-account/{id}")
    public String edit(@PathVariable("id") Integer id){
        System.out.println(id);
        return "thanks";
    }
}
