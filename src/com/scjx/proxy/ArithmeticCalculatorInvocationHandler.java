package com.scjx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*使用动态代理需要实现InvocationHandler接口*/
public class ArithmeticCalculatorInvocationHandler implements InvocationHandler {

	/*要代理的对象，动态代理只有在运行时才知道代理谁，所以定义为Object类型，可以代理任意对象*/
    private Object target = null;
    
    /*通过构造函数传入原对象*/
    public ArithmeticCalculatorInvocationHandler(Object target)
    {
        this.target = target;
    }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		 /*原对象方法调用前处理日志信息*/
		System.out.println("执行拦截前");
		 for(Object arg : args)
        {
            this.argValidtor((Double)arg);// 拦截
        }
		 
		Object result = method.invoke(this.target, args);
		
		 /*原对象方法调用后处理日志信息*/
		System.out.println("the method ["+method.getName()+"]"+"end with result ("+result+")");
		
		return result;
	}
	
	 /*获取代理类*/
    public Object getProxy()
    {
	
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }
    private void argValidtor(double arg) throws Exception
    {
        if(arg < 0)
            throw new Exception("参数不能为负数！");
    }
    
}
