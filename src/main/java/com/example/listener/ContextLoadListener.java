package com.example.listener;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 22:07
 * @description：容器初始化
 * @modified By：
 * @version: $
 */
public class ContextLoadListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 读取web.xml中全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();
        // 应用上下文 加到全局
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("app",app);
        System.out.println("初始化配置.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
