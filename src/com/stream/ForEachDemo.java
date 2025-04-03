package com.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

// Filter and forEach Demo
public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("piter");
		list.add("marek");
		list.add("mac");
		
		//Filter
		for(String s2: list) {
			if(s2.startsWith("m")) {
				System.out.println(s2);
			}
		}
		
		list.stream().filter(t -> t.startsWith("m")).forEach(s -> System.out.println(s));
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(4, "d");
		
		map1.entrySet().stream()
		.filter(obj -> obj.getKey()%2 == 0 ).forEach(s -> System.out.println(s));
		
		//ForEach
		
//		for(String s: list) {
//			System.out.println(s);
//		}
		
//		list.stream().forEach(t -> System.out.println(t));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
//		map.forEach((x,y) -> System.out.println(x+" : "+y));
//		//to use stream for map
//		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		
		//internally functionality of forEach
//		Consumer<String> consumer = (t) -> System.out.println(t);
//		for(String s1 : list) {
//			consumer.accept(s1);
//		}
	}
}
