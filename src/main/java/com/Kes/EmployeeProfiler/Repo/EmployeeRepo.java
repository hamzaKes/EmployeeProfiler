package com.Kes.EmployeeProfiler.Repo;

import com.Kes.EmployeeProfiler.Employeemodel.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long>{

}
