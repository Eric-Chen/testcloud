package com.testcloud.consumerboot.web;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eric on 17/04/2017.
 */
@RestController
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping("/consume")
    public @ResponseBody String showConsume(){

    }

}
