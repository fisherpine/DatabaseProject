package com.ggbz.service.impl;

import com.ggbz.dao.CourseDAO;
import com.ggbz.pojo.Course;
import com.ggbz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDAO courseDAO;
    @Override
    public void UpdateCourseById(Course course) {
       courseDAO.UpdateCourseById(course);
    }

    @Override
    public Course QueryCourseById(String id) {
         return courseDAO.QueryCourseById(id);
    }
}
