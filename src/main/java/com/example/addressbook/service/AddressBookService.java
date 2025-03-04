package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AddressBookService implements IAddressBookService {
    private final Map<Long, AddressBook> addressBookMap = new HashMap<>();
    private long idCounter = 1;

    // Get all contacts
    @Override
    public List<AddressBook> getAllContacts() {
        return new ArrayList<>(addressBookMap.values());
    }

    // Add a new contact with an auto-generated ID
    @Override
    public AddressBook addContact(AddressBookDTO addressBookDTO) {
        AddressBook newContact = new AddressBook();
        newContact.setId(idCounter++);
        newContact.setName(addressBookDTO.getName());
        newContact.setAddress(addressBookDTO.getAddress());
        addressBookMap.put(newContact.getId(), newContact);
        return newContact;
    }
}
