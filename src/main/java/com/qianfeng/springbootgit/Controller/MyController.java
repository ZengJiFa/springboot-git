package com.qianfeng.springbootgit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZengJiFA
 * @Date 2019/6/5
 */
@Controller
@RequestMapping("my")
public class MyController {

    @RequestMapping("hello")
    @ResponseBody
    public  String hello(){
         System.out.println("dddddd");
        return  "hello";
    }

}
