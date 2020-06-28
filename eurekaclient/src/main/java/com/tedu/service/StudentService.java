package com.tedu.service;

import com.tedu.entity.Student;

import java.util.Collection;

public interface StudentService {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
