package com.Lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// Normal way
		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(4));

		// Using lambda Function

		Predicate<Integer> pre = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		// pre = t -> t%2 == 0;
		System.out.println(pre.test(23));
		
		List<Integer> list = Arrays.asList(1,2,4,5,6,4,34);
		// print even numbers
		list.stream().filter(pre).forEach(t -> System.out.println("print: "+t));
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print: "+t));
	}

}
