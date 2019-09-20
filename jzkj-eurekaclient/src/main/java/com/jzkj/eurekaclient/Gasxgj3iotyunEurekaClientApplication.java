package com.jzkj.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;





@SpringBootApplication
@EnableDiscoveryClient // 声明这是一个Eureka Client
public class Gasxgj3iotyunEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Gasxgj3iotyunEurekaClientApplication.class, args);
        System.out.println("Eureka Client 启动成功");
    }
}