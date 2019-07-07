package com.f1soft.environmentsetup.controller;

import com.f1soft.environmentsetup.entity.Person;
import com.f1soft.environmentsetup.service.serviceimpl.PersonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    private PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Person person) {

        return ResponseEntity.ok(personService.create(person));
    }
}
