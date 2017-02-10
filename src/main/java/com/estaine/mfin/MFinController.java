package com.estaine.mfin;

import com.estaine.mfin.model.Account;
import com.estaine.mfin.model.Person;
import com.estaine.mfin.service.AccountService;
import com.estaine.mfin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class MFinController {

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Account> index() {
        return accountService.findAll();
    }
}
