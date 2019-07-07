package com.f1soft.environmentsetup.service.serviceimpl;

import com.f1soft.environmentsetup.entity.Person;
import com.f1soft.environmentsetup.repository.PersonRepository;
import com.f1soft.environmentsetup.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        log.info("saves the data in database - {}", person);
        log.error("error logger");
        System.out.println(personRepository.save(person));
        return personRepository.save(person);
    }
}
