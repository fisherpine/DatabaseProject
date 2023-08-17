package com.ggbz.service;

import com.ggbz.pojo.Student;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface StudentService {
    public Student QueryStudentById(String id);
    public void UpdateStudentById(Student student);
}
