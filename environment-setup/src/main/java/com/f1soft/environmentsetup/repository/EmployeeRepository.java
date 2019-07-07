package com.f1soft.environmentsetup.repository;

import com.f1soft.environmentsetup.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
