package com.coding.cloud.mall.auth.config;

import com.coding.cloud.mall.common.config.BaseSwaggerConfig;
import com.coding.cloud.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.coding.cloud.mall.auth.controller")
                .title("mall认证中心")
                .description("mall认证中心相关接口文档")
                .contactName("lwz")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}