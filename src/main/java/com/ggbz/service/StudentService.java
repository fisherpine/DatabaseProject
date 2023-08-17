package com.ggbz.service;

import com.ggbz.pojo.Student;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface StudentService {
    public Student QueryStudentById(String id);
    public void UpdateStudentById(Student student);

    /*按专业查询学生*/
    public List<Student> QueryStudentsByDept(String dept);
}
