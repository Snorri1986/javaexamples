package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this we will add all related advices for logging

    // execution is pointcut expression
    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))") //aspect type
    public void beforeAddAccountAdvice() {
        System.out.println("\n=======>>>>> Executing @Before advice on addSillyMember()");
    }
}
