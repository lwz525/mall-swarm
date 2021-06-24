package com.coding.cloud.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @package: com.coding.cloud.mall.gateway
 * @ClassName: MallGatewayApplication
 * @Author: lwz
 * @CreateTime: 2021/6/24 17:01
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGatewayApplication.class, args);
    }
}
