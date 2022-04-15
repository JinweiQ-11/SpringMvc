package com.example.web;
import com.example.service.UserServcie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 21:14
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
//        UserServcie userService = (UserServcie) applicationContext.getBean("userService");
        ServletContext servletContext = req.getServletContext();
       // 自己写 ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);//Spring框架
        UserServcie userServcie = (UserServcie) applicationContext.getBean("userService");
        userServcie.save();
    }
}
