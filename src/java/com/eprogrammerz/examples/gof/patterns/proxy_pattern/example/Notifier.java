package com.eprogrammerz.examples.gof.patterns.proxy_pattern.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by rajkumar on 6/5/2016.
 */
public class Notifier implements InvocationHandler {
    private Object vehicle;

    public Notifier(Object vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Notifier: "+method.getName());
        Object object = method.invoke(vehicle,args);
        System.out.println("Notifier: "+method.getName());
        return object;
    }
}
