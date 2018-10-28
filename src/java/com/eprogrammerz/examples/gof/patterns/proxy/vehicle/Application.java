package com.eprogrammerz.examples.gof.patterns.proxy.vehicle;

import java.lang.reflect.Proxy;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        IVehicle c = new Car("Herbie");
        ClassLoader cl = IVehicle.class.getClassLoader();
        IVehicle v1 = (IVehicle) Proxy.newProxyInstance(cl, new Class[]
                {IVehicle.class}, new Logger(c));
        v1.start();
//        IVehicle v2 = (IVehicle) Proxy.newProxyInstance(cl, new Class[] { IVehicle.class }, new Notifier(v1));
//        v2.start();
    }
}
//    MyProxyInterface foo = (MyProxyInterface) java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), Class[] { MyProxyInterface.class },new MyDynamicProxyClass(obj));
