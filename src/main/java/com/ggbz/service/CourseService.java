package com.ggbz.service;

import com.ggbz.pojo.Course;

import java.util.List;

public interface CourseService {
    public void UpdateCourseById(Course course);


    public Course QueryCourseByCno(String cno);
}
