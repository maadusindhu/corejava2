package com.tnsif.abstaction;

public class Square extends Shape{
	private float side;
	public Square() {
		side=.0f;
	}
	public Square(float side) {
		this.side=side;
	}
	void calarea() {
		super.area=side*side;
		
		
	}

}
