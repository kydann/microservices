package com.citibanamex.api.bne.saveremoteauthorization.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.citibanamex.api.bne.saveremoteauthorization.repositories.accountsRepository;
import com.citibanamex.api.bne.saveremoteauthorization.beans.model;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class apicontroller {

    @Autowired
    accountsRepository repo;

    @RequestMapping(value = "/getOwnAccounts", method = RequestMethod.GET)
    public List<model> getAllOwnAccounts() {

        List<model> mod = new ArrayList<>();
        repo.findAll().forEach(mod::add);

        return mod;
    }
/*
    @RequestMapping(value = "/addOwnAccount", method = RequestMethod.POST)
    public model addAccount(@RequestBody model mod) {

        model _mod = repo.save(new model(mod.getACCOUNT_NUMBER(), mod.getCONTRACT_NUMBER(), mod.getPRODUCT_CODE(), mod.getINSTRUMENT_CODE(), mod.getBRANCH(),
                mod.getACCOUNT_NAME(), mod.getACCOUNT_NICKNAME(), mod.getACCOUNT_TYPE(), mod.getCURRENCY(), mod.getSTARTING_DATE(),
                mod.getBANK_ELEC_USAGE(), mod.getCLIENT_RELATION(), mod.getDATE(), mod.getTIME(), mod.getCELL_NUMBER(), mod.getLAST_PAY(),
                mod.getLAST_PAY_DATE()));

        return _mod;
    }

    @RequestMapping(value = "/deleteOwnAccount/{account}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteOwnAccount(@PathVariable("account") model account) {

        repo.deleteById(account);

        return new ResponseEntity<>("Delete Account with Account: ", HttpStatus.OK);

    }

    @RequestMapping(value = "/getOwnAccountById/{account}", method = RequestMethod.GET)
    public List<model> getOwnAccountById(@PathVariable("account") long account) {

        List<model> mod = repo.findByAccount(account);
        
        return mod;
    }

    @RequestMapping(value = "/updOwnAccount/{account}")
    public ResponseEntity<model> updateCustomer(@PathVariable("account") long account, @RequestBody model acc) {

        Optional<model> accountData = repo.findById(account);

        if (accountData.isPresent()) {
            model _account = accountData.get();
            _account.setACCOUNT_NUMBER(acc.getACCOUNT_NUMBER());
            _account.setCONTRACT_NUMBER(acc.getCONTRACT_NUMBER());
            _account.setPRODUCT_CODE(acc.getPRODUCT_CODE());
            _account.setINSTRUMENT_CODE(acc.getINSTRUMENT_CODE());
            _account.setBRANCH(acc.getBRANCH());
            _account.setACCOUNT_NAME(acc.getACCOUNT_NAME());
            _account.setACCOUNT_NICKNAME(acc.getACCOUNT_NICKNAME());
            _account.setACCOUNT_TYPE(acc.getACCOUNT_TYPE());
            _account.setCURRENCY(acc.getCURRENCY());
            _account.setSTARTING_DATE(acc.getSTARTING_DATE());
            _account.setBANK_ELEC_USAGE(acc.getBANK_ELEC_USAGE());
            _account.setCLIENT_RELATION(acc.getCLIENT_RELATION());
            _account.setDATE(acc.getDATE());
            _account.setTIME(acc.getTIME());
            _account.setCELL_NUMBER(acc.getCELL_NUMBER());
            _account.setLAST_PAY(acc.getLAST_PAY());
            _account.setLAST_PAY_DATE(acc.getLAST_PAY_DATE());
            return new ResponseEntity<>(repo.save(_account), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
*/
}
