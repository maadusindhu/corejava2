package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private long adharno;
	private String address;
	private long phno;
	public Citizen(String name,long adharno,String addess,long phno) {
	super();
	this.name=name;
	this.adharno=adharno;
	this.address=address;
	this.phno=phno;
}
public Citizen(){
}
public String getname()
{
	return name;
}
}	


