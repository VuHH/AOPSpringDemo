package com.demo.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.demo.demo.service.ProductService..*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Before method: {}", joinPoint.getSignature().getName());
        //System.out.println("Aspect Before");
    }

    @AfterReturning(pointcut = "execution(* com.demo.demo.service.ProductService..*(..))", returning = "result")
    public void logAfterReturningMethod(JoinPoint joinPoint, Object result) {
        logger.info("After method: {}", joinPoint.getSignature().getName());
        logger.info("Method returned value: {}", result);

        //System.out.println("logAfterReturningMethod");
    }
}
