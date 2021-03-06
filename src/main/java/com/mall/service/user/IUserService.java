package com.mall.service.user;

import com.mall.orm.user.User;

import java.io.Serializable;

/**
 * Created by jayson on 2014/8/8.
 */
public interface IUserService {
    public User getUserByName(String loginName);
    public Serializable save(User user);
}
