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
    public void AddStudent(Student student) {
        studentDAO.AddStudent(student);
    }

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

    @Override
    public int QueryNumberByDeptLesson(String dept, String lesson) {
        return studentDAO.QueryNumberByDeptLesson(dept,lesson);
    }

    @Override
    public float QueryFailureRate(String dept, String lesson, String cno) {
        float FailureRate = (float) QueryFlunkNumberByDeptLessonCno(dept, lesson, cno) / QueryNumberByDeptLesson(dept, lesson);
        return FailureRate;
    }

    @Override
    public int QueryAllLevelsPeopleNumber(String dept, String lesson, String cno,String grade_segment) {
        return studentDAO.QueryAllLevelsPeopleNumber(dept,lesson,cno,grade_segment);
    }

    @Override
    public float QueryAllLevelsRate(String dept, String lesson, String cno, String grade_segment) {
        //默认本班同学都学了这门课
        float LeversRate = (float) QueryAllLevelsPeopleNumber(dept, lesson, cno, grade_segment) / QueryNumberByDeptLesson(dept, lesson);
        return LeversRate;
    }

    /**
     * 条件查询学生
     * @param student
     * @return
     */
    @Override
    public List<Student> QueryStudent(Student student) {
        List<Student> list =  studentDAO.list(student);
        return list;
    }
}
