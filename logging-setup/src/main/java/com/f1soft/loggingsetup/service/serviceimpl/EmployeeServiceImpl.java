package com.f1soft.loggingsetup.service.serviceimpl;

import com.f1soft.loggingsetup.entity.Employee;
import com.f1soft.loggingsetup.repository.EmployeeRepository;
import com.f1soft.loggingsetup.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository EmployeeRepository;

    @Override
    public Employee create(Employee Employee) {
        log.info("INFO LOG");
        return EmployeeRepository.save(Employee);
    }
}
