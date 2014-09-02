package com.scjx.factory;

public class PlaneFactory implements MoveFactory {

	@Override
	public Moveable create() {
	
		return new Plane();
	}

}
