package com.example.controller;

import com.example.User;
import com.example.V0;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/10 14:47
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("Controller runing");
        return "success";
    }
    @RequestMapping(value = "/quick2",method = RequestMethod.GET)
    // model 封装数据    view 展示数据

    public ModelAndView save2(){
        // 设置模型数据
        ModelAndView modelAndView = new ModelAndView();
        // 设置视图
        modelAndView.setViewName("success");
        modelAndView.addObject("username","21212");
        return modelAndView;
    }

    @RequestMapping(value = "/quick3",method = RequestMethod.GET)
    public ModelAndView save3(ModelAndView modelAndView){
        // 设置模型数据
        // 设置视图
        modelAndView.setViewName("success");
        modelAndView.addObject("username","21212");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4",method = RequestMethod.GET)
    public String save4(Model model){
        // 设置模型数据
        // 设置视图
        model.addAttribute("username","21212");
        return "success";
    }

    @RequestMapping(value = "/quick5",method = RequestMethod.GET)
    public String save5(HttpServletRequest request){
        // 设置模型数据
        // 设置视图
        request.setAttribute("username","21212");
        return "success";
    }

    @RequestMapping(value = "/quick6",method = RequestMethod.GET)
    public void save6(HttpServletResponse response) throws IOException {
        // 设置模型数据
        // 设置视图
        response.getWriter().println("12121212");
    }

    @RequestMapping(value = "/quick7",method = RequestMethod.GET)
    @ResponseBody //不进行页面跳转
    public void save7(HttpServletResponse response) throws IOException {
        // 设置模型数据
        // 设置视图
        response.getWriter().println("12121212");
    }
    @RequestMapping(value = "/quick8",method = RequestMethod.GET)
    @ResponseBody //不进行页面跳转
    public String save8(HttpServletResponse response) throws IOException {
        // 设置模型数据
        // 设置视图
        User user = new User();
        user.setAddr("1212");
        user.setName("haha");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
//        response.getWriter().println("12121212");
    }

    @RequestMapping(value = "/quick10",method = RequestMethod.GET)
    @ResponseBody //不进行页面跳转 期望自动转换成json字符串
    // 使用配置
    public User save10(HttpServletResponse response) throws IOException {
        // 设置模型数据
        // 设置视图
        User user = new User();
        user.setAddr("1212");
        user.setName("haha");
        return user;
//        response.getWriter().println("12121212");
    }


    @RequestMapping(value = "/quick12",method = RequestMethod.GET)
    @ResponseBody //不进行页面跳转 期望自动转换成json字符串
    public void save12(String username,int age) throws IOException {
        // 设置模型数据
        // 设置视图
        User user = new User();
        user.setAddr("1212");
        user.setName("haha");
//        response.getWriter().println("12121212");
    }
    @RequestMapping(value = "/quick13",method = RequestMethod.POST)
    @ResponseBody //不进行页面跳转 期望自动转换成json字符串
    public void save13(V0 vo) throws IOException {
//        response.getWriter().println("12121212");
        System.out.println(vo);
    }

    @RequestMapping(value = "/quick15",method = RequestMethod.POST)
    @ResponseBody //不进行页面跳转 期望自动转换成json字符串
    public void save15(@RequestBody List<User> userList) throws IOException {
//        response.getWriter().println("12121212");
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick19/{name}",method = RequestMethod.GET)
    @ResponseBody
    public void quickMethod19(@PathVariable(value = "name",required = true) String name){
        System.out.println(name);
    }
}
