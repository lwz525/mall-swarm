package com.coding.cloud.mall.gateway.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @package: com.coding.cloud.mall.gateway.config
 * @ClassName: IgnoreUrlsConfig
 * @Author: lwz
 * @CreateTime: 2021/6/24 17:16
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
@ConfigurationProperties(prefix = "secure.ignore")
public class IgnoreUrlsConfig {
    private List<String> urls;
}
