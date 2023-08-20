package com.ggbz.service;

import com.ggbz.pojo.Student;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface StudentService {
    public Student QueryStudentBySno(String sno);
    public void UpdateStudentBySno(Student student);

    /*按专业查询学生*/
    public List<Student> QueryStudentsByDeptAndLesson(String dept,String lesson);


    public List<Student> QueryFlunkByCno(String cno);


    //按照 专业 班级 科目 查询 不及格人数
    public int QueryFlunkNumberByDeptLessonCno(String dept,String lesson,String cno);


}
