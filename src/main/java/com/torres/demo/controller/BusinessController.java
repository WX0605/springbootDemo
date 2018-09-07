package com.torres.demo.controller;



import com.torres.demo.services.BusinessServicesImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/9/7
 */

@RestController

public class BusinessController {
    @Resource
    private BusinessServicesImpl businessServices;

    @RequestMapping(value = "/add")
    public String add(){
            return businessServices.add();
    }

    @RequestMapping(value = "/test")
    public void test(){
        System.out.println("hello world!");
    }

}
