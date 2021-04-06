package com.ck.controller;

import com.ck.entity.Test1;
import com.ck.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

/**
 * created  on 2021/4/1 16:44
 */
@Controller
public class TestController {

    @Autowired
    private ITestService service;

    @GetMapping("queryAll")
    public String query(HashMap map){
        List<Test1> test1s = service.queryAll();
        map.put("list", test1s);
        return "index";
    }


}
