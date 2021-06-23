package com.coding.cloud.mall.common.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
@Order(1)
@Slf4j
public class WebLogAspect {
    @Pointcut("execution(public * com.coding.cloud.mall.controller.*.*(..) || execution(public * com.coding.cloud" +
            ".mall.*.controller.*.*(..)")
    public void webLog() {
    }
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

    }
    @AfterReturning(value = "webLog()", returning = "ret")
    public void doAfterReturning(Object ret) throws Throwable {

    }
    @Around("webLog()")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }
}