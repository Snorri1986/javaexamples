package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

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
}
