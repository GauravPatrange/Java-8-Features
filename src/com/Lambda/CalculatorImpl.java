package com.Lambda;

interface Calculator {
	/* void switchOn(); */
//	void sum(int input);
	int subtract(int val1, int val2);
}

public class CalculatorImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Calculator calculator = () -> { System.out.println("Switch On"); }; 
		 * // () ->
		 * {body}
		 * 
		 * calculator.switchOn();
		 */
		
//		Calculator calculator = (input) -> System.out.println("Sum "+ input);
//		calculator.sum(123);
		
		Calculator calculator = (val1, val2) -> {
			if(val1 < val2) {
				throw new RuntimeException("First won't be smaller than second value");
			}else {
				return val1 - val2;
			}
		};
		
		System.out.println(calculator.subtract(12, 2));
		

	}
	 // () -> {body}
}
