package com.example.hibernate.controller;

import com.example.hibernate.entity.Persons;
import com.example.hibernate.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonRepository repo;
    public PersonController(PersonRepository repository){
        this.repo = repository;
    }

    @GetMapping("/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city_of_living") String city) {
        return repo.getPersonByCity(city);
    }
}
