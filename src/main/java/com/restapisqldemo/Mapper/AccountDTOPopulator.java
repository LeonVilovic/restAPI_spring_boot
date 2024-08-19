package com.restapisqldemo.Mapper;

import com.restapisqldemo.DTO.AccountDTO;
import com.restapisqldemo.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountDTOPopulator {
    
    AccountDTOPopulator INSTANCE = Mappers.getMapper(AccountDTOPopulator.class);
    
    AccountDTO populateAccountDTO(Account account);
}
