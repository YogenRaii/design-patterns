package com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Logger;

/**
 * Created by ${YogenRai} on 4/30/2016.
 */
public class ProxyAccountDAO implements InvocationHandler {
    private Object obj;

    public ProxyAccountDAO(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new ProxyAccountDAO(obj));
    }

    Logger logger = Logger.getLogger(ProxyAccountDAO.class.getName());
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try{
            logger.info("before method called: " + method.getName());
            long startTime = System.nanoTime();
            result = method.invoke(obj,args);
            long endTime = System.nanoTime();
            logger.info(String.format("%s took %d ns",method.getName(),(endTime-startTime)));
        }catch (InvocationTargetException e){
            throw e.getTargetException();
        }finally {
            logger.info("after method: "+method.getName());
        }
        return result;
    }
}
