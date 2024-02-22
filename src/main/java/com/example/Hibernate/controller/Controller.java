package com.example.Hibernate.controller;

import com.example.Hibernate.entity.Person;
import com.example.Hibernate.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {
    private final Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonByCity(@RequestParam(value = "city", required = false) String city) {
        return repository.getPersonByCity(city);
    }
}
