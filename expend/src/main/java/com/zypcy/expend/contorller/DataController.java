package com.zypcy.expend.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DataController {

    @RequestMapping("/getByName")
    public String getByName(String name){
        return "hi ,welcome to " + name;
    }

    @RequestMapping("/dataPage")
    public ModelAndView datePage(){
        return new ModelAndView("dataPage");
    }
}
