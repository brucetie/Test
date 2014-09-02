package com.scjx.factory;

public class BroomFactory implements MoveFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}

}
