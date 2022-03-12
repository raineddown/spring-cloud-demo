package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lixiaolong
 * @date 2020/12/18 16:05
 * @description 支付服务
 */
@SpringBootApplication
public class CloudStreamRabbitmqConsumer8804Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8804Application.class, args);
        System.out.println("启动成功");
    }

}
