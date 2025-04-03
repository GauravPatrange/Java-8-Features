package com.stream.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.stream.realWorldExample.DataBase;
import com.stream.realWorldExample.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(2);
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
		
		// Traditional uproach
		List<Employee> emps = DataBase.getEmployee();
//		Collections.sort(emps, new MyComparator() );
//		System.out.println(emps);
//		
		
		// Anonymous inner class
		Collections.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getSalary() - o1.getSalary());
			}
		});
		System.out.println(emps);
		
		
		emps.stream().sorted((e1,e2)-> (int)(e1.getSalary()- e2.getSalary())).forEach(System.out::println);
		emps.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(System.out::println);
		System.out.println();
		emps.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}
}

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
}
