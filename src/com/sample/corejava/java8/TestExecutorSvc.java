package com.sample.corejava.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class MyCounter {
    private int count = 0;

    // Synchronized Method 
    public  void increment() {
        synchronized (this) {
        	count = count + 1;	
		}
    	
    }

    public int getCount() {
        return count;
    }
}

public class TestExecutorSvc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Runnable r1 =() -> {
			System.out.println("Thread"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			};
			
		Thread t1 = new Thread(r1);
		System.out.println("step 1");
		t1.start();
		try {
			t1.join(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Thread t2 = new Thread(r1);
		System.out.println("step 2");
		t2.start();
		
		try {
			t2.join(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("step3");*/
		
		ExecutorService exSvc = Executors.newFixedThreadPool(20);
		MyCounter c = new MyCounter();
		
        for(int i = 0; i < 1000; i++) {
        	exSvc.submit(() -> c.increment());
        }

        exSvc.shutdown();
        try {
			exSvc.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println(c.getCount());
	}

}
