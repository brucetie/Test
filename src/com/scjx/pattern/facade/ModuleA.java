package com.test.pattern.facade;

public class ModuleA {
	
	 /**
     * 提供给子系统外部使用的方法
     */
    public void a1(){
    	
    	System.out.print("aaaaaaa");
    };
    
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    public void a2(){
    
    };
    public void a3(){};

}
