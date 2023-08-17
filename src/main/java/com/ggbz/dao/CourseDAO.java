package com.ggbz.dao;

import com.ggbz.pojo.Course;

import java.util.List;

public interface CourseDAO {
    /*课程表*/

    /*查询所有课程*/
    public List<Course> QueryAllCourse();

    /*通过课号查询课程*/
    public List<Course> QueryCourseBySno(String Sno);

    /*添加课程*/
    public void AddCourse(Course course);

    public void UpdateCourseById(Course course);

    public Course QueryCourseByCno(String cno);
}
