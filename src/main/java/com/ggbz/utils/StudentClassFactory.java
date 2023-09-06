package com.ggbz.utils;

public class StudentClassFactory {
    public static String getClassByStudentId(String studentId){
        String Class = studentId.substring(4, 6);
        return Class;
    }
}
