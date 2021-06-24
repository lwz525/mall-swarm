package com.coding.cloud.mall.gateway.config;

import com.coding.cloud.mall.gateway.component.RestAuthenticationEntryPoint;
import com.coding.cloud.mall.gateway.component.RestfulAccessDeniedHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

/**
 * @package: com.coding.cloud.mall.gateway.config
 * @ClassName: ResourceServerConfig
 * @Author: lwz
 * @CreateTime: 2021/6/24 17:18
 * @Description:
 */
@Configuration
@AllArgsConstructor
@EnableWebFluxSecurity
public class ResourceServerConfig {
    private final AuthenticationManager authenticationManager;
    private final IgnoreUrlsConfig ignoreUrlsConfig;
    private final RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    private final RestAuthenticationEntryPoint restAuthenticationEntryPoint;
//    private final IgnoreU
}