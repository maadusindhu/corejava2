package com.tnsif.multithreading;

public class Implementingrunable implements runable{
	public static void main(String[] args) {
		Implementingrunable r=new Implementingrunable();
		//r.start();
		Thread t1=new Thread(r);
		t1.start();
		
	}
public void run() {
	System.out.println("implementing runable interface");
}
}
