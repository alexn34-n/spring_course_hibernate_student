package com.alexn.hibernate_student.service;

import com.alexn.hibernate_student.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public void  saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}
