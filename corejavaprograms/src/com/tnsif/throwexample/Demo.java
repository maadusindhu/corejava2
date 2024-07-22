package com.tnsif.throwexample;

import java.io.IOException;
import com.tns.exceptiondemo.main;
public class Demo {
public static void main(String[] args) {
	Throwsdemo d=new Throwsdemo();
	try
	{
		d.display();
	}
	catch(IOException e) {
		System.out.println("exception caught e"+e);
	}
}
}
