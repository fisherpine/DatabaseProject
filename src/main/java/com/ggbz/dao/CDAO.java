package com.ggbz.dao;

import com.ggbz.pojo.C;

import java.util.List;

public interface CDAO {
    /*课程表*/

    /*查询所有课程*/
    public List<C> QueryAllCourse();

    /*通过课号查询课程*/
    public C QueryCourseById(String id);

    /*添加课程*/
    public void AddCourse(C course);
}
