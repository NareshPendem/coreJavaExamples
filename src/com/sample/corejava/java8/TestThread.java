package com.sample.corejava.java8;

class Counter{
	
	int i = 0;
	
	public void increment() {
		i++;
	}
	
}

public class TestThread {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 
		Counter c = new Counter();
		
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int j = 0 ; j < 100000 ; j++) {
					c.increment();
				}
				
			}
		}); 
		
		t.start();
		t.join();
		
		
		Thread t2 = new Thread(()-> {
			for(int j = 0 ; j < 10000 ; j++) {
				c.increment();
			}
		});
		
		t2.start();
		t2.join();
		
		System.out.println(c.i);
	}

}
