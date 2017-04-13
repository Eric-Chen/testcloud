package com.testcloud.testboot.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by eric on 12/04/2017.
 */
@RestController
public class TestController {

    @RequestMapping("/test_new_api")
    public String showTestResult(){
        return "testststst";
    }

}
