package com.ruike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 吴泽胜
 * @FileName AdminController
 * @date 2020-11-12 2:27 下午
 * @Software: IntelliJ IDEA
 */
@Controller
@RequestMapping("/admin")
public class AdminController {


    // 路径请求
    @RequestMapping("/{pages}")
    public String UserUrl(@PathVariable String pages){
        System.out.println(pages);
        return "index";
    }
}
