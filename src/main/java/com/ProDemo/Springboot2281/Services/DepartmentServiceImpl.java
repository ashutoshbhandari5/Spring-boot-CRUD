package com.ProDemo.Springboot2281.Services;

import com.ProDemo.Springboot2281.Entity.Department;
import com.ProDemo.Springboot2281.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department deleteDepartmentById(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).get();
        departmentRepository.deleteById(departmentId);
        return department;
    }

    @Override
    public Department updateDepartmentById(Department department, Long departmentId) {
        Department foundDepartment = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(foundDepartment.getDepartmentName())){
            foundDepartment.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) && ! "".equalsIgnoreCase(foundDepartment.getDepartmentAddress())){
            foundDepartment.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && ! "".equalsIgnoreCase(foundDepartment.getDepartmentCode())){
            foundDepartment.setDepartmentCode(department.getDepartmentCode());
        }

        departmentRepository.save(foundDepartment);
        return foundDepartment;
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
