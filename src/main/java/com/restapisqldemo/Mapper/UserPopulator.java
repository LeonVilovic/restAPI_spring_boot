package com.restapisqldemo.Mapper;

import com.restapisqldemo.DTO.UserDTO;
import com.restapisqldemo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserPopulator {

    UserPopulator INSTANCE = Mappers.getMapper(UserPopulator.class);

    @Mapping(target = "createdDate", ignore = true)
    @Mapping(target = "lastModifiedDate", ignore = true)
    User populateUser(UserDTO userDTO);
}
