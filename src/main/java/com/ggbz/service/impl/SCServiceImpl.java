package com.ggbz.service.impl;

import com.ggbz.dao.SCDAO;
import com.ggbz.pojo.SC;
import com.ggbz.pojo.Student;
import com.ggbz.service.SCService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SCServiceImpl implements SCService {
    @Autowired
    private SCDAO scdao;
    @Override
    public SC QueryGradeBySnoAndCno(String sno,String cno) {
        return scdao.QueryGradeBySnoAndCno(sno,cno);
    }

    @Override
    public void UpdateGrade(SC sc) {
        scdao.UpdateGrade(sc);
    }



    @Override
    public List<SC> QuerySCBySno(String sno) {
        return scdao.QuerySCBySno(sno);
    }

    @Override
    public int QueryCreditBySno(String sno) {
        return scdao.QueryCreditBySno(sno);
    }


}
