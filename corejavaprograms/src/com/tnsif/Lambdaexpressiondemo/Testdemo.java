package com.tnsif.Lambdaexpressiondemo;

public class Testdemo {
public static void main(String[] args) {
	Runnable basic=()->{String Threadname=Thread.currentThread().getName();
	System.out.println("threadname:"+Threadname);
	};
	Thread t1=new Thread(basic);
	Thread t2=new Thread(basic);
	Thread t3=new Thread(basic);
	t1.start();
	t2.start();
	t3.start();
}
}
