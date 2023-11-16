package com.example.tp4thymleaf.service;

import com.example.tp4thymleaf.entity.Staff;

import java.util.List;

public interface StaffService {
    void save(Staff staff );
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
