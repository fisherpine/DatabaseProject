package com.ggbz.dao;

import com.ggbz.pojo.SC;
import org.apache.ibatis.annotations.Param;

public interface SCDAO {
    //多参数需要使用@Param，可以直接使用
    public SC QueryGradeBySnoAndCno(@Param("sno") String sno,@Param("cno") String cno);

    void UpdateGrade(SC sc);
}
