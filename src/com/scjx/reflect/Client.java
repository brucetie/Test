package com.scjx.reflect;

public class Client {
public static void main(String[] args) {
	ITargetInterface target = new Target();
	MyProxy my = new MyProxy();
	ITargetInterface proxy = (ITargetInterface) my.getProxy(target);
	proxy.doSomeThing();
}
}
