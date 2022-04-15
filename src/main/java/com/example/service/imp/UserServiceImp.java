package com.example.service.imp;
import com.example.dao.UserDao;
import com.example.service.UserServcie;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/7 22:57
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServiceImp implements UserServcie {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImp() {

    }

    @Override
    public void save() {
        userDao.save();
    }
}
