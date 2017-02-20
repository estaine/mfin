package com.estaine.mfin;

import com.estaine.mfin.person.Person;
import com.estaine.mfin.person.PersonService;
import com.estaine.mfin.transaction.TransactionService;
import com.stormpath.sdk.servlet.account.AccountResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {

    @Autowired
    TransactionService transactionService;

    @Autowired
    PersonService personService;

    @Autowired
    AccountResolver accountResolver;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest req, Model model) {

        if(accountResolver.getAccount(req) != null) {
            Person person = personService.findByEmail(accountResolver.getAccount(req).getEmail());

            String fullName = person.getFirstName() + " " + person.getLastName();
            model.addAttribute("fullName", fullName);
        }

        return "index";
    }
}
