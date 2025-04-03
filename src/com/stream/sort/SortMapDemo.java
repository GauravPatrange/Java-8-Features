package com.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.stream.realWorldExample.Employee;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		map.put("two", 2);

		// Traditional approach
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		;

//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}

		// Anonymous

		List<Entry<String, Integer>> entries1 = new ArrayList<>(map.entrySet());
		Collections.sort(entries1, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}

		map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
		System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println();
		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {

			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}

		});
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikesh", "CIVIL", 900000), 80);
		employeeMap.put(new Employee(243, "Bimal", "ETC", 100000), 40);
		employeeMap.put(new Employee(543, "Sourav", "DEFENCE", 1200000), 50);
		employeeMap.put(new Employee(323, "Prakash", "Social", 700000), 120);

		System.out.println(employeeMap);
		
		employeeMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);
	}

}
