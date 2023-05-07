package com.cloudkitchen.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudkitchen.entities.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
