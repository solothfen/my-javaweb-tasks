package com.gx.controller;

import com.gx.domain.ke;
import com.gx.service.keService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class keController {

    @Autowired
    private keService keService;

    @RequestMapping("/ke/findAll")
    public String findAll(Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询所有课程...");
        // 调用service的方法
        List<ke> kebiao = keService.findAll();
        model.addAttribute("kebiao",kebiao);
        return "kebiao";
    }

    @RequestMapping("/ke/add")
    public String add(){//跳转新增视图
        return "add";
    }
    @PostMapping("/ke/add")
    public String add(ke ke){
        keService.saveke(ke);
        return "redirect:/ke/findAll";//直接重定向上面的处理方法，实现了请求复用
    }
    @RequestMapping("/ke/update")
    public String update(){//跳转新增视图
        return "update";
    }
    @PostMapping("/ke/update1")
    public String update1(ke ke){
        keService.updateke(ke);
        return "redirect:/ke/findAll";//直接重定向上面的处理方法，实现了请求复用
    }
    @RequestMapping("/ke/find")
    public String find(){//跳转新增视图
        return "kebiao1";
    }

    @PostMapping("/ke/find1")
    public String find1(String ke_name,Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询课程...");
        // 调用service的方法
        List<ke> kebiao2 = keService.find(ke_name);
        model.addAttribute("kebiao2",kebiao2);
        return "kebiao2";
    }
    @RequestMapping ("/ke/delete")
    public String find1(String ke_name){  //存数据， Model对象
        keService.deleteke(ke_name);
        return "redirect:/ke/findAll";
    }



}

