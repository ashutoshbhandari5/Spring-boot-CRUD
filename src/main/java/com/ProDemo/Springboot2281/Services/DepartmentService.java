package com.ProDemo.Springboot2281.Services;

import com.ProDemo.Springboot2281.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartments();

    Department getDepartmentById(Long departmentId);

    Department deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Department department, Long departmentId);

    Department getDepartmentByName(String departmentName);
}
