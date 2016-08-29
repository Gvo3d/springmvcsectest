package com.apress.prospring4;

import com.apress.prospring4.ch16.Contact;

import java.util.List;

public interface ContactService{
    List<Contact> findAll();
    Contact findByid(Long id);
    Contact save(Contact contact);
}