package com.f1soft.loggingsetup.repository;

import com.f1soft.loggingsetup.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
