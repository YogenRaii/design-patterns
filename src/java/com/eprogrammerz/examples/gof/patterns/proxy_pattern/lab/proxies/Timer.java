package com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class Timer implements InvocationHandler {
	private Object o;

	public Timer(Object o) {
		this.o = o;
	}

	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		// start timer
		long start = System.currentTimeMillis();
		//invoke method
		Object result = m.invoke(o, args);
		//calc time
		long elapsedTimeMillis = System.currentTimeMillis()-start;
		
		System.out.println("Timer: it took " + elapsedTimeMillis+" milliseconds to invoke "+ m.getName());
		return result;
	}
}
