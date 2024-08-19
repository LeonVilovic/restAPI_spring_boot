package com.restapisqldemo.DTO;

import lombok.Data;

@Data
public class AccountDTO {
    
    private Long id;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private UserDTO user;
}
