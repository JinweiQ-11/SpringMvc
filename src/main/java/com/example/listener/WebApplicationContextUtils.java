package com.example.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/10 14:02
 * @description：
 * @modified By：
 * @version: $
 */
public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}

