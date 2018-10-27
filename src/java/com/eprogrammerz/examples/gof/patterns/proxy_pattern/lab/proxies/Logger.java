package com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.proxies;

import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.dao.IAccountDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Logger implements InvocationHandler {
	private IAccountDAO dao;

	public Logger(IAccountDAO dao) {
		this.dao = dao;
	}

	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		System.out.println("Logger: Invoking " + m.getName());
		return m.invoke(dao, args);
	}
}