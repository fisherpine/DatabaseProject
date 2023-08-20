package com.ggbz.service.impl;

import com.ggbz.dao.StudentDAO;
import com.ggbz.pojo.Student;
import com.ggbz.service.StudentService;
import org.apache.ibatis.annotations.Param;
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
    public List<Student> QueryStudentsByDeptAndLesson(String dept,String lesson) {
        return studentDAO.QueryStudentsByDeptAndLesson(dept,lesson);
    }


    @Override
    public List<Student> QueryFlunkByCno(String cno) {
        return studentDAO.QueryFlunkByCno(cno);
    }

    @Override
    public int QueryFlunkNumberByDeptLessonCno(@Param("dept") String dept, @Param("lesson")String lesson, @Param("cno")String cno) {
        return studentDAO.QueryFlunkNumberByDeptLessonCno(dept,lesson,cno);
    }
}
