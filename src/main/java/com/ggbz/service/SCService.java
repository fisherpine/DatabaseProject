package com.ggbz.service;

import com.ggbz.pojo.SC;
import com.ggbz.pojo.Student;

import java.util.List;

public interface SCService {
    //查询单科成绩
    public SC QueryGradeBySnoAndCno(String sno,String cno);

    public void UpdateGrade(SC sc);

    //查询某学生全部成绩
    public List<SC> QuerySCBySno(String sno);

    public int QueryCreditBySno(String sno);

    //各科平均分数
    public float QueryAvgGradeByDeptLessonCno(String dept,String lesson,String cno);

}
