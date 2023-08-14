package com.ggbz.text;

import com.ggbz.dao.UserDAO;
import com.ggbz.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatisSpring {
    /*
    * 用于测试：Spring与Mybatis的整合
    * */
    @Test
    public void text1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User();
        user.setRole(1);
        user.setHm("admin1");
        user.setPwd("111111");


        userDAO.save(user);

    }
}
