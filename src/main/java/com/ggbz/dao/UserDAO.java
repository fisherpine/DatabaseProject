package com.ggbz.dao;

import com.ggbz.pojo.User;

public interface UserDAO {
    public void save(User user);

    /**
     * 查询用户根据用户名
     * @param user
     * @return
     */
    User QueryUser(User user);
}
