package com.ggbz.service;

import com.ggbz.pojo.SC;

import java.util.List;

public interface SCService {
    public SC QueryGradeBySnoAndCno(String sno,String cno);

    public void UpdateGrade(SC sc);

    public List<SC> QueryFlunkByCno(String cno);

    public List<SC> QuerySCBySno(String sno);

    public void QueryCreditBySno(String sno);
}
