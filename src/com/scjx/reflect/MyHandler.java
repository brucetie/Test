package com.scjx.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



public class MyHandler implements InvocationHandler {
	
	private Object obj;
	
	private Interceptor interceptor = new Interceptor();

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
			Object result  = null;
			interceptor.before();
			result = method.invoke(obj, args);
			interceptor.after();
		return result;
	}

}
