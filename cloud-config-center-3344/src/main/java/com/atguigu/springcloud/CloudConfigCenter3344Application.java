package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lixiaolong
 */
@SpringBootApplication
@EnableConfigServer
@ServletComponentScan("com.atguigu.springcloud.filter")
public class CloudConfigCenter3344Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class, args);
        System.out.println("启动成功");

    }

}
