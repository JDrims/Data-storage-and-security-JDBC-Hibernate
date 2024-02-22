package com.example.Hibernate.repository;

import com.example.Hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        return entityManager
                .createQuery("SELECT * FROM persons WHERE city_of_living = :city")
                .setParameter("city", city)
                .getResultList();
    }
}
