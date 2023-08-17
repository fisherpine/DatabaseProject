package com.ggbz.dao;

import com.ggbz.pojo.Course;

import java.util.List;

public interface CourseDAO {
    /*课程表*/

    /*查询所有课程*/
    public List<Course> QueryAllCourse();

    /*通过课号查询课程*/
    public Course QueryCourseById(String id);

    /*添加课程*/
    public void AddCourse(Course course);
}
