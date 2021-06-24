package com.coding.cloud.mall.gateway.component;

import cn.hutool.json.JSONUtil;
import com.coding.cloud.mall.common.api.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @package: com.coding.cloud.mall.gateway.component
 * @ClassName: RestfulAccessDeniedHandler
 * @Author: lwz
 * @CreateTime: 2021/6/24 17:24
 * @Description:
 */
@Component
public class RestfulAccessDeniedHandler implements ServerAccessDeniedHandler {

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, AccessDeniedException denied) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().set("Access-Control-Allow-Origin","*");
        response.getHeaders().set("Cache-Control","no-cache");
        String body = JSONUtil.toJsonStr(CommonResult.forbidden(denied.getMessage()));

    }
}
