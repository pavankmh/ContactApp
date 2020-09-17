package com.contact.persistance;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
//1 i am good
//2 i am bad
//3 i am good
//4 i am bad


@Repository
public interface ContactDetailsRespository extends JpaRepository<ContactDetailsEntity, Serializable> {

}
