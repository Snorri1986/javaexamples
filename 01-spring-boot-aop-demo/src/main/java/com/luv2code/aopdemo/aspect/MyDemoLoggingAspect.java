package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this we will add all related advices for logging

    @Before("execution(public void addAccount())") //aspect type
    public void beforeAddAccountAdvice() {

    }
}
