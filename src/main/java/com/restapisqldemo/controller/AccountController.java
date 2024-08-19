package com.restapisqldemo.controller;

import com.restapisqldemo.DTO.AccountDTO;
import com.restapisqldemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    private AccountService accountservice;

    @Autowired
    public AccountController(AccountService accountservice) {
        this.accountservice = accountservice;
    }

    @PostMapping("/add")
    public ResponseEntity<AccountDTO> setAccount(@RequestBody AccountDTO accountDTO) {
        return new ResponseEntity(accountservice.insertAccount(accountDTO), HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<AccountDTO> setUser(@RequestParam Long id) {
        return new ResponseEntity(accountservice.getAccountByUserID(id), HttpStatus.CREATED);
    }
}
