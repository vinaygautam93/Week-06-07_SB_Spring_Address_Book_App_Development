package com.example.addressbook.dto;


import lombok.Data;

// Data Transfer Object to receive user input
@Data
public class AddressBookDTO {
    private String name;
    private String address;
}
