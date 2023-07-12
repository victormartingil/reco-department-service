package com.reco.departmentservice.service.impl;

import com.reco.departmentservice.model.Department;
import com.reco.departmentservice.repository.DepartmentRepository;
import com.reco.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(final DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
