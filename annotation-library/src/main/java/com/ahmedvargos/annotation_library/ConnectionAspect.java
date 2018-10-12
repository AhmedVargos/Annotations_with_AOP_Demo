package com.ahmedvargos.annotation_library;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class ConnectionAspect {
    private static final String RESTRICT_TO_INTERNET = "execution(@com.ahmedvargos.annotation_library.annotations.RunWithInternet * * (..))";


    @Pointcut(value = RESTRICT_TO_INTERNET)
    public void RestrictToInternetAnnotationMethod() {

    }

    @Around("RestrictToInternetAnnotationMethod()")
    public void checkMethodConnection(ProceedingJoinPoint joinPoint) throws Throwable{

        if(MyNetworkManager.isConnected()){ // A class i made to check for the Internet connection.
            joinPoint.proceed();
        }
    }
}