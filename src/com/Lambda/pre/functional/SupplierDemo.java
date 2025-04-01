package com.Lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hi Gaurav";
	}
	
	public static void main(String[] args) {
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
		
//		Supplier<String> supplier = () ->  { return "Hi Gaurav"; }; 
		Supplier<String> supplier = () -> "Hi Gaurav";
		
		//System.out.println(supplier.get());
		
		List<String> list = Arrays.asList("a","v","b");
		
//		System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Gaurav"));
	}
 
}
