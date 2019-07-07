package com.f1soft.loggingsetup.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_employee")
public class Employee extends AbstractPersistableEntity<Long>  {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

}
