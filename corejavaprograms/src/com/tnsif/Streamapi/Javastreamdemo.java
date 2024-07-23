package com.tnsif.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Javastreamdemo {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product(1,"hp",400000));
	pl.add(new Product(2,"dell",300000));
	pl.add(new Product(3,"apple",600000));
	List<Float> pl2=pl.stream().filter(p->p.price>30000).map(p->p.price)
			.collect(Collectors.toList());
	System.out.println(pl2);
	
}
}
