package com.stream.realWorldExample;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176,"Roshan", "IT", 600000));
		list.add(new Employee(388,"Bikesh", "CIVIL", 900000));
		list.add(new Employee(243,"Bimal", "ETC", 100000));
		list.add(new Employee(543,"Sourav", "DEFENCE", 1200000));
		list.add(new Employee(323,"Prakash", "Social", 700000));
		return list;
	}
}
