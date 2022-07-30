package com.Kes.EmployeeProfiler.Employeemodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class EmployeeModel {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private long Id;
    private String Name;
    private String FamilyName;
    private String Department;
    private String Role;
    private String phoneNumber;
    @Column(nullable = false,updatable = false)
    private String employeeCode;
}
