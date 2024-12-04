package io.potato.ems_backend.mapper;

import io.potato.ems_backend.dto.EmployeeDto;
import io.potato.ems_backend.entity.Employee;

// MAPPER CLASS: to map the data b/w "ENTITY & DTO"

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }


    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}
