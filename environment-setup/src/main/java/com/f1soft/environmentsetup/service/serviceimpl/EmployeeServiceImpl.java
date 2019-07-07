package com.f1soft.environmentsetup.service.serviceimpl;

import com.f1soft.environmentsetup.entity.Employee;
import com.f1soft.environmentsetup.repository.EmployeeRepository;
import com.f1soft.environmentsetup.service.EmployeeService;
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
        return EmployeeRepository.save(Employee);
    }
}
