package com.example;

import java.util.List;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/13 20:31
 * @description：
 * @modified By：
 * @version: $
 */
public class V0 {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public String toString() {
        return "V0{" +
                "userList=" + userList +
                '}';
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
