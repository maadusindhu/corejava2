package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Reducedemo {
public static void main(String[] args) {
	List<Integer>number=Arrays.asList(1,2,3,4,5);
	int sum=number.stream().reduce(0, (a,b)->a+b);
	System.out.println("sum of the elements "+sum);
	
}
}
