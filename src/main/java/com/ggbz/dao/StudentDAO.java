package com.ggbz.dao;

import com.ggbz.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDAO {
    //学生表

    /*添加学生*/
    public void AddStudent(Student student);

    /*通过学号查询学生*/
    public Student QueryStudentBySno(String sno);

    /*查询所有学生*/
    public List<Student> QueryAllStudent();

    /*通过学号删除学生*/
    public void DeleteStudentBySno(String sno);

    /*更新数据通过id*/
    public void UpdateStudentBySno(Student student);


    List<Student> QueryStudentsByDeptAndLesson(@Param("dept") String dept, @Param("lesson") String lesson);


    List<Student> QueryFlunkByCno(String cno);

    int QueryFlunkNumberByDeptLesonCno(@Param("dept")String dept, @Param("lesson") String lesson,  @Param("cno")String cno);
}
