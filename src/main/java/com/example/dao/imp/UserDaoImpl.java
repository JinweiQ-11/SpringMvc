package com.example.dao.imp;


import com.example.User;
import com.example.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/5 22:36
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoImpl implements UserDao {
    // 普通类型
    private String username;

    public String getUsername() {
        return username;
    }

    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserDaoImpl() {
        System.out.println("ceate");
    }

    public void save() {
        System.out.println("save" + username);
    }
    public void init(){
        System.out.println("init");
    }
    public void destory(){
        System.out.println("destory");
    }
}
