package com.ggbz.service;

import com.ggbz.pojo.Student;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface StudentService {
    public void AddStudent(Student student);
    public Student QueryStudentBySno(String sno);
    public void UpdateStudentBySno(Student student);

    /*按专业查询学生*/
    public List<Student> QueryStudentsByDeptAndLesson(String dept,String lesson);


    public List<Student> QueryFlunkByCno(String cno);


    //按照 专业 班级 科目 查询 不及格人数
    public int QueryFlunkNumberByDeptLessonCno(String dept,String lesson,String cno);

    //按照 专业 班级 查询班级总人数
    public int QueryNumberByDeptLesson(String dept,String lesson);

    //按班级统计不及格人数及比例
    public float QueryFailureRate(String dept,String lesson,String cno);

    //按班级统计各分数段人数及比例
    public int QueryAllLevelsPeopleNumber(String dept,String lesson,String cno,String grade_segment);

    //各分段比例
    public float QueryAllLevelsRate(String dept,String lesson,String cno,String grade_segment);
}
