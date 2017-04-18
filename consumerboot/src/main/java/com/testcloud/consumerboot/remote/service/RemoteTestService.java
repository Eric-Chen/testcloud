package com.testcloud.consumerboot.remote.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eric on 18/04/2017.
 */
@FeignClient("service-provider")
public interface RemoteTestService {

    @RequestMapping("/test_new_api")
    String doAction();

}
