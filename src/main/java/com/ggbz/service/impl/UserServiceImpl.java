package com.ggbz.service.impl;

import com.ggbz.dao.UserDAO;
import com.ggbz.pojo.User;
import com.ggbz.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserSerivce {
    @Autowired
    private UserDAO userDAO;
    @Override
    public Boolean login(User user) {
        User VOuser = userDAO.QueryUser(user);
        if (VOuser == null){
            return false;
        }else{
            return true;
        }
    }
}
