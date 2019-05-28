package org.spring.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author Dzmitry Dziokin
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class HateInterfacesAop {

    @After("execution(* org.spring.example..*.*(..))")
    public void noInterface() {
        System.out.println("Aop");
    }
}
