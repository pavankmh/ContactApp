package com.contact.persistance;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface ContactDetailsRespository extends JpaRepository<ContactDetailsEntity, Serializable> {

}
