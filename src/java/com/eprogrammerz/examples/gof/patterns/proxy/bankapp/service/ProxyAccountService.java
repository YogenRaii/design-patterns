package com.eprogrammerz.examples.gof.patterns.proxy.bankapp.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Logger;

/**
 * Created by ${YogenRai} on 4/30/2016.
 */
public class ProxyAccountService implements InvocationHandler {
    Logger logger = Logger.getLogger(ProxyAccountService.class.getName());
    private Object obj;

    public ProxyAccountService(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new ProxyAccountService(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            long startTime = System.nanoTime();
            result = method.invoke(obj, args);
            long endTime = System.nanoTime();
            logger.info(String.format("%s took %d ns", method.getName(), (endTime - startTime)));
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
        return result;
    }
}
