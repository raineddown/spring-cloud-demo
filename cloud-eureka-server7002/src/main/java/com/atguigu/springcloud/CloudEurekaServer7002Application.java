package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lixiaolong
 * @date 2020/12/19 14:12
 * @description 注册中心
 */
@SpringBootApplication
@EnableEurekaServer // 设置为服务注册中心 EurekaServer
public class CloudEurekaServer7002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002Application.class, args);
        System.out.println("启动成功");
    }
}
