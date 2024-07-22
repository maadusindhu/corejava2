package com.tnsif.synchronization;

public class Example {
 void display() {
Thread g=Thread.currentThread();
synchronized(this) {
for(int i=0;i<3;i++) {
	try {
		Thread.sleep(1000);
System.out.println(g.getName()+" "+i);
	}
	catch(Exception e) {
}
}
}
}
}