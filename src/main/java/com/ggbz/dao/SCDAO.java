package com.ggbz.dao;

import com.ggbz.pojo.SC;
import com.ggbz.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SCDAO {
    //多参数需要使用@Param，可以直接使用
    public SC QueryGradeBySnoAndCno(@Param("sno") String sno,@Param("cno") String cno);

    void UpdateGrade(SC sc);



    List<SC> QuerySCBySno(String sno);

    int QueryCreditBySno(String sno);
}
