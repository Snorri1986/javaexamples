package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this we will add all related advices for logging

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    // execution is pointcut expression
    @Before("forDaoPackage()") //aspect type
    public void beforeAddAccountAdvice() {
        System.out.println("\n=======>>>>> Executing @Before advice on addSillyMember()");
    }
}
