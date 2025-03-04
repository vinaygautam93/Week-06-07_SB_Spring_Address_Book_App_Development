package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import java.util.List;

// Interface defining service methods
public interface IAddressBookService {
    List<AddressBook> getAllContacts();
    AddressBook addContact(AddressBookDTO addressBookDTO);
}
