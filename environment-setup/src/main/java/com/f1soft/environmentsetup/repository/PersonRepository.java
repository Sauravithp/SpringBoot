package com.f1soft.environmentsetup.repository;

import com.f1soft.environmentsetup.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
