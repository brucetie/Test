package com.scjx.thread;

public class MyRunnable implements Runnable {

	int number,count=1;
	
	
	public MyRunnable(int number) {
		this.number = number;
		System.out.println("创建线程"+number);
	}

	@Override
	public void run() {
		while(true){
			System.out.println("线程"+number+"计数器"+count);
			if(count++==6)break;
		}

	}
	
	public static void main(String[] args) {
	  for(int i=0;i<5;i++)new Thread(new MyRunnable(i+1)).start();
	}

}
