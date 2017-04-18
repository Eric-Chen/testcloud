package com.testcloud.consumerboot.web;

import com.testcloud.consumerboot.remote.service.RemoteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by eric on 17/04/2017.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RemoteTestService remoteTestService;

    @RequestMapping("/consume")
    public String showConsume(){
        ResponseEntity<String> result = restTemplate.getForEntity("http://SERVICE-PROVIDER/test_new_api", String.class);
        return result.getBody();
    }

    @RequestMapping("/remote")
    public String showRemote(){
        return remoteTestService.doAction();
    }



}
