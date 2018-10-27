package com.eprogrammerz.examples.gof.patterns.proxy_pattern.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Dynamic Proxy class
 */
public class Logger implements InvocationHandler {
    private Object vehicle;

    public Logger(Object v) {
        this.vehicle = v;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logger: "+ method.getName());
        Object object = method.invoke(vehicle,args);
        return object;
    }
}

//public interface MyProxyInterface
//{
//    public Object MyMethod();
//}