package com.estaine.mfin;

import com.estaine.mfin.model.Person;
import com.estaine.mfin.model.Transaction;
import com.estaine.mfin.service.PersonService;
import com.estaine.mfin.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    TransactionService transactionService;

    @Autowired
    PersonService personService;

    @RequestMapping(value = "transactions", method = RequestMethod.GET)
    public String transactions(Model model) {
        List<Transaction> trxs = transactionService.findAll();
        model.addAttribute("trxs", trxs);
        return "trxs";
    }

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public String persons(Model model) {
        List<Person> perss = personService.findAll();
        model.addAttribute("perss", perss);
        return "perss";
    }
}
