package com.estaine.mfin.controller;

import com.estaine.mfin.model.User;
import com.estaine.mfin.model.Transaction;
import com.estaine.mfin.service.UserService;
import com.estaine.mfin.service.TransactionService;
import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.servlet.account.AccountResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    TransactionService transactionService;

    @Autowired
    UserService userService;

    @Autowired
    AccountResolver accountResolver;

    @RequestMapping(value = "transactions", method = RequestMethod.GET)
    public String transactions(Model model) {
        List<Transaction> trxs = transactionService.findAll();
        model.addAttribute("trxs", trxs);
        return "trxs";
    }

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public String persons(Model model) {
        List<User> perss = userService.findAll();
        model.addAttribute("perss", perss);
        return "perss";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest req, Model model) {

        String email = "test";
        if(accountResolver.getAccount(req) != null) {
            email = accountResolver.getAccount(req).getEmail();
        }
        model.addAttribute("pemail", email);
        return "index";
    }
}
