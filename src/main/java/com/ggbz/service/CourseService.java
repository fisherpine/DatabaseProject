package com.ggbz.service;

import com.ggbz.pojo.Course;

public interface CourseService {
    public void UpdateCourseById(Course course);

    public Course QueryCourseById(String id);
}
