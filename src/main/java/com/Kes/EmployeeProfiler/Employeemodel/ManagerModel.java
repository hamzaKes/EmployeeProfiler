package com.Kes.EmployeeProfiler.Employeemodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class ManagerModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false,updatable = false)
private long Id;
private String Name;
private String FamilyName;
private String phoneNumber;
private String role;
private String department;
@Column(nullable = false,updatable = false)
    private String employeeCode;
}
