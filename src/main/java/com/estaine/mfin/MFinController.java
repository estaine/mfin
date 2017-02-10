package com.estaine.mfin;

import com.estaine.mfin.model.SimpleTransaction;
import com.estaine.mfin.model.TransactionHeader;
import com.estaine.mfin.service.SimpleTransactionService;
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
    SimpleTransactionService simpleTransactionService;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<SimpleTransaction> index() {
        List<SimpleTransaction> trxs = simpleTransactionService.findAll();
        return trxs;
    }
}
