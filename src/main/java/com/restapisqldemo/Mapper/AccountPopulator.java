package com.restapisqldemo.Mapper;

import com.restapisqldemo.DTO.AccountDTO;
import com.restapisqldemo.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountPopulator {

    AccountPopulator INSTANCE = Mappers.getMapper(AccountPopulator.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    @Mapping(target = "lastModiviedDate", ignore = true)
    Account populateAccount(AccountDTO accountDTO);
}
