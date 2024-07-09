package com.tnsif.constructor;

public class Conexample {
	public static void main(String[] args) {
		System.out.println("default con");
	}
	Conexample(int i){
		System.out.println("welcome");
	}
Conexample(int i,int j){
	System.out.println("hello world");
}
Conexample(int i,string n){
	System.out.println("different type");
}
public static void main(String[] args) {
Conexample c=new Conexample();
 
}
}
