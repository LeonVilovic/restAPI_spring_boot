package com.restapisqldemo.service;

import com.restapisqldemo.DTO.UserDTO;
import com.restapisqldemo.Mapper.UserDTOPopulator;
import com.restapisqldemo.Mapper.UserPopulator;
import com.restapisqldemo.model.Account;
import com.restapisqldemo.model.User;
import com.restapisqldemo.repository.AccountRepository;
import com.restapisqldemo.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Optional<UserDTO> getUser(Long id) {
        return userRepository.findById(id)
                .map(UserDTOPopulator.INSTANCE::populateUserDTO);
    }

    public UserDTO insertUser(UserDTO userDTO) {
        User user = UserPopulator.INSTANCE.populateUser(userDTO);
        user.setCreatedDate(new Date());
        return UserDTOPopulator.INSTANCE.populateUserDTO(userRepository.save(user));
    }

    public UserDTO updateUser(UserDTO userDTO) {
        User user = UserPopulator.INSTANCE.populateUser(userDTO);
        user = userRepository.findById(user.getId())
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        user.setLastModifiedDate(new Date());
        return UserDTOPopulator.INSTANCE.populateUserDTO(userRepository.save(user));
    }

    public void deleteUser(Long id) {
        User userExample = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        Account accountExample = new Account();
        accountExample.setUser(userExample);
        Example<Account> example = Example.of(accountExample);
        List<Account> accounts = accountRepository.findBy(example, query -> query.all());
        accountRepository.deleteAll(accounts);
        userRepository.deleteById(id);
    }

}
