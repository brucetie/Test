package com.scjx.factory;

public class Test {

	
	public static void main(String[] args) {
		MoveFactory mfFactory = new PlaneFactory();
		Moveable moveable = mfFactory.create();
		moveable.run();
	}
}
