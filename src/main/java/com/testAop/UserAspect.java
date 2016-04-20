package com.testAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

    @Pointcut("execution(* com.testAop..*(..))")
    public void testTest() {
    }

    @Before("testTest()")
    public void textxx() {
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    /*@After("within (* com.dotbean.*)")
    public void textxx1() {
        System.err.println("@After advice");
    }

    @AfterReturning("within (* com.dotbean.*)")
    public void textxx2() {
        System.err.println("@AfterReturning advice");
    }

    @AfterThrowing("within (* com.dotbean.*)")
    public void textxx3() {
        System.err.println("@AfterThrowing advice");
    }*/
}
