package com.ggbz.service.impl;

import com.ggbz.dao.StudentDAO;
import com.ggbz.pojo.Student;
import com.ggbz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentSerivceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student QueryStudentBySno(String student) {
        return studentDAO.QueryStudentBySno(student);
    }

    @Override
    public void UpdateStudentBySno(Student student) {
        studentDAO.UpdateStudentBySno(student);
    }

    @Override
    public List<Student> QueryStudentsByDept(String dept) {
        return studentDAO.QueryStudentsByDept(dept);
    }


    @Override
    public List<Student> QueryFlunkByCno(String cno) {
        return studentDAO.QueryFlunkByCno(cno);
    }
}
