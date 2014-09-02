package com.test.pattern.facade;

public class ModuleFacade {
	
	ModuleA a = new ModuleA();
	
	ModuleB b = new ModuleB();
	
	public  void a1(){
		a.a1();
	}
	public  void b1(){
		b.b1();
	}

	
	public void test(){
        ModuleA a = new ModuleA();
        a.a1();
        ModuleB b = new ModuleB();
        b.b1();
    }

}
