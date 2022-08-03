package com.ProDemo.Springboot2281.Controller;

import com.ProDemo.Springboot2281.Entity.Department;
import com.ProDemo.Springboot2281.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department SaveDepartment (@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartmentList(){
        return departmentService.getDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public Department deleteDepartmentById(@PathVariable("id") Long departmentId){
         return departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/department/{id}")
    public Department updateDepartmentById(@RequestBody Department department, @PathVariable ("id") Long departmentId){
        return departmentService.updateDepartmentById(department, departmentId);
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }
}
