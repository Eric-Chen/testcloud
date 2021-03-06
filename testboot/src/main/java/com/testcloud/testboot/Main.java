package com.testcloud.testboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by eric on 12/04/2017.
 */
@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
public class Main {

    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
        new SpringApplicationBuilder(Main.class).web(true).run(args);
    }

}
