package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lixiaolong
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3366Application.class, args);
        System.out.println("启动成功");

    }
}
