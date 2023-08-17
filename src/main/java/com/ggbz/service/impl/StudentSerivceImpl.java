package com.ggbz.service.impl;

import com.ggbz.dao.StudentDAO;
import com.ggbz.pojo.Student;
import com.ggbz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentSerivceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student QueryStudentById(String id) {
        return studentDAO.QueryStudentById(id);
    }

    @Override
    public void UpdateStudentById(Student student) {
        studentDAO.UpdateStudentById(student);
    }

}
