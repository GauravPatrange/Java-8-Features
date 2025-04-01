package com.Lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer =  (t) -> { System.out.println("Printing "+t); };
		
		consumer.accept(10);
		
		List<Integer> list = Arrays.asList(1,2,4,32,3,4,34);
		//In tutorial
		list.stream().forEach(consumer);
		
		list.forEach(t -> System.out.println("print"+t));
	}

}
