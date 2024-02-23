package com.example.Hibernate.repository;

import com.example.Hibernate.entity.Contact;
import com.example.Hibernate.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, Contact> {
    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findPersonByContact_AgeBeforeOrderByContact_AgeAsc(Integer age);

    Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndContact_SurnameContainingIgnoreCase(String name, String surname);
}
