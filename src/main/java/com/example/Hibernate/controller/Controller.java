package com.example.Hibernate.controller;

import com.example.Hibernate.entity.Person;
import com.example.Hibernate.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class Controller {
    private final Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> findPersonByCityOfLiving(@RequestParam(value = "city", required = false) String city) {
        return repository.findPersonByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> findPersonByContact_AgeBeforeOrderByContact_AgeAsc(@RequestParam(value = "age", required = false) Integer age) {
        return repository.findPersonByContact_AgeBeforeOrderByContact_AgeAsc(age);
    }

    @GetMapping("/persons/by-name&surname")
    public Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndContact_SurnameContainingIgnoreCase(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {
        return repository.findPersonByContact_NameContainingIgnoreCaseAndContact_SurnameContainingIgnoreCase(name, surname);
    }
}
