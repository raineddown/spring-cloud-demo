package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lixiaolong
 * @date 2020/12/18 16:05
 * @description 支付服务
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Application.class, args);
        System.out.println("启动成功");
    }

}
