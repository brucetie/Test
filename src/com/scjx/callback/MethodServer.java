package com.scjx.callback;

//被调用者李四的方法
public class MethodServer {
	
	public double getTime(CallBackInterface callBack) {
        long start = System.currentTimeMillis();
        callBack.doSome();//服务端调用客户端
        long end = System.currentTimeMillis();
        System.out.println("cost time=" + (end - start));
        return end - start;
    }

}
