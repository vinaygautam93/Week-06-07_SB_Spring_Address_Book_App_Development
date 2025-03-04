package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// Service class implementing business logic
@Service
public class AddressBookService implements IAddressBookService {
    private final List<AddressBook> addressBookList = new ArrayList<>();

    // Get all stored contacts
    @Override
    public List<AddressBook> getAllContacts() {
        return addressBookList;
    }

    // Add a new contact to the list
    @Override
    public AddressBook addContact(AddressBookDTO addressBookDTO) {
        AddressBook newContact = new AddressBook();
        newContact.setName(addressBookDTO.getName());
        newContact.setAddress(addressBookDTO.getAddress());
        addressBookList.add(newContact);
        return newContact;
    }
}
