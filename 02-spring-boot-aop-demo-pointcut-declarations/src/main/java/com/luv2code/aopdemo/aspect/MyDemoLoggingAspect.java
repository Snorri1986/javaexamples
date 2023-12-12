package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //pointcut for getters
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    private void getter() {}

    //pointcut for setters
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    private void setter() {}

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    // combine
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {}



    @Before("forDaoPackageNoGetterSetter()") //aspect type
    public void beforeAddAccountAdvice() {
        System.out.println("\n=======>>>>> Executing @Before advice on addSillyMember()");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=======>>>>> Performing API Analytics");
    }
}
