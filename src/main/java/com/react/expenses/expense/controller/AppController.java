package com.react.expenses.expense.controller;

import com.react.expenses.expense.service.InstanceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private InstanceInfoService instanceInfoService;

    @GetMapping(path = "/")
    public String getAppInfo(){
        return instanceInfoService.getInstanceInfo();
    }

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World " + " V2 " + instanceInfoService.getInstanceInfo();
    }

}
