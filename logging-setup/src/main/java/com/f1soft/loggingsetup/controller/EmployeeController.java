package com.f1soft.loggingsetup.controller;

import com.f1soft.loggingsetup.entity.Employee;
import com.f1soft.loggingsetup.service.serviceimpl.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    private EmployeeServiceImpl EmployeeService;

    public EmployeeController(EmployeeServiceImpl EmployeeService) {
        this.EmployeeService = EmployeeService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Employee employee){
        log.error("ERROR LOG");
        return ResponseEntity.ok(EmployeeService.create(employee));
    }
}
