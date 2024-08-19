package com.restapisqldemo.service;

import com.restapisqldemo.DTO.AccountDTO;
import com.restapisqldemo.Mapper.AccountDTOPopulator;
import com.restapisqldemo.Mapper.AccountPopulator;
import com.restapisqldemo.model.Account;
import com.restapisqldemo.model.User;
import com.restapisqldemo.repository.AccountRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountDTO insertAccount(AccountDTO accountDTO) {
        Account account = AccountPopulator.INSTANCE.populateAccount(accountDTO);
        account.setCreationDate(new Date());
        return AccountDTOPopulator.INSTANCE.populateAccountDTO(accountRepository.save(account));
    }

    public List<AccountDTO> getAccountByUserID(Long id) {
        User userExample = new User();
        userExample.setId(id);
        Account accountExample = new Account();
        accountExample.setUser(userExample);
        Example<Account> example = Example.of(accountExample);

        List<Account> accounts = accountRepository.findBy(example, query -> query.all());

        if (accounts.size() < 1) {
            throw new RuntimeException("Account not found");
        }

        List<AccountDTO> accountDTOList = new ArrayList<>();

        for (Account account : accounts) {

            accountDTOList.add(AccountDTOPopulator.INSTANCE.populateAccountDTO(account));
        }

        return accountDTOList;
    }
}
