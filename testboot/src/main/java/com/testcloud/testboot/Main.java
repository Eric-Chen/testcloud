package com.testcloud.testboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by eric on 12/04/2017.
 */
@SpringBootApplication
@ComponentScan
@EnableEurekaClient
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
