package com.example.demo.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {









//    @Pointcut("execution(* com.example.demo.UniLibrary.*(..))")
//    private void allMethodsfromUniLib(){
//
//    }
//    @Pointcut("execution( public void com.example.demo.UniLibrary.returnMagazine())")
//    private void returnMagazinfromUniLib(){
//
//    }
//
//    @Pointcut("allMethodsfromUniLib() && !returnMagazinfromUniLib()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMEthodsExceptReturnMagazineAdvice(){
//        System.out.println(" beforeAllMEthodsExceptReturnMagazineAdvice: Log #10 ");
//    }






//@Pointcut("execution(* com.example.demo.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//
//}
//    @Pointcut("execution(* com.example.demo.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary() ")
//    private void AllGetandReturnMethodsFromLibrary(){}
//
//
//@Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetLoggingAdvice: writing Log #1");
//}
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2  ");
//    }
//
//    @Before("AllGetandReturnMethodsFromLibrary()")
//    public void beforegetAndReturninLoggingAdvice(){
//        System.out.println("beforegetAndReturninLoggingAdvice: writing log #3 ");
//    }


    @Before("com.example.demo.Aspects.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: logging of tried to get book/magazine");
    }





}
