package com.sample.corejava.java8;

public class ThreadWaitNotify {

	
	 private String packet;
     
	    // True if receiver should wait
	    // False if sender should wait
	 private boolean transfer = true;
	  
	    public synchronized void send(String packet) {
	        while (!transfer) {
	            try { 
	                wait();
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.err.println("Thread interrupted"+e); 
	            }
	        }
	        transfer = false;
	         
	        this.packet = packet;
	        notifyAll();
	    }
	  
	    public synchronized String receive() {
	        while (transfer) {
	            try {
	                wait();
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.err.println("Thread interrupted"+e); 
	            }
	        }
	        transfer = true;
	 
	        notifyAll();
	        return packet;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
