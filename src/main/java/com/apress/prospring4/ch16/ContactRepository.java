package com.apress.prospring4.ch16;
import org.springframework.data.repository.CrudRepository;
public interface ContactRepository extends CrudRepository<Contact, Long> {
}