package com.scjx.base;


public class TestClient extends Thread { 
	private SequenceNumber sn;
	public TestClient(SequenceNumber sn) {
		this.sn = sn;
	}

	@Override
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" "+sn.getNextNum());
		}
	}
   
}  