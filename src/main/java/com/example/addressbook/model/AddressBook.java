package com.example.addressbook.model;


import jakarta.persistence.*;
import lombok.Data;

// Entity class representing the address book entry
@Entity
@Table(name = "addressbook")
@Data
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
}
