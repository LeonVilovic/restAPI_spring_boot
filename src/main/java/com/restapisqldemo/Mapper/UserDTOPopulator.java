package com.restapisqldemo.Mapper;

import com.restapisqldemo.DTO.UserDTO;
import com.restapisqldemo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDTOPopulator {
    
    UserDTOPopulator INSTANCE = Mappers.getMapper(UserDTOPopulator.class);
    
    UserDTO populateUserDTO(User userDTO);
}
