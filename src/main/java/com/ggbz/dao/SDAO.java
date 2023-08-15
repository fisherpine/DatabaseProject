package com.ggbz.dao;

import com.ggbz.pojo.S;

import java.util.List;

public interface SDAO {
    //学生表

    /*添加学生*/
    public void AddStudent(S student);

    /*通过学号查询学生*/
    public S QueryStudentById(String id);

    /*查询所有学生*/
    public List<S> QueryAllStudent();

    /*通过学号删除学生*/
    public void DeleteStudentById(String id);




}
