package com.omrbranch.stepdefn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Sample {

	private void oneWithoutHead() {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l.get(2));
	}

	private void twoWithoutHead() {
		List<ArrayList<String>> emp = new ArrayList<>();
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();
		s.add("John");
		s.add("john@gmail.com");
		s.add("Java");

		s1.add("David");
		s1.add("david@gmail.com");
		s1.add("Sql");

		s2.add("Tim");
		s2.add("tim@gmail.com");
		s2.add("tim");

		emp.add(s);
		emp.add(s1);
		emp.add(s2);

		ArrayList<String> newList = emp.get(2);
		System.out.println(newList);
		System.out.println(newList.get(1));

	}

	private void oneWithHead() {
		Map<String, String> emp = new LinkedHashMap<String, String>();
		emp.put("name", "John");
		emp.put("email", "john@gmail.com");
		emp.put("course", "Sql");

		System.out.println(emp.get("email"));
	}

	private void twoWithHead() {
		List<LinkedHashMap<String, String>> emp = new ArrayList<>();

		LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> m1 = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> m2 = new LinkedHashMap<String, String>();

		m.put("name", "John");
		m.put("email", "john@gmail.com");
		m.put("course", "sql");

		m1.put("name", "Jim");
		m1.put("email", "jim@gmail.com");
		m1.put("course", "Java");

		m2.put("name", "Tim");
		m2.put("email", "tim@gmail.com");
		m2.put("course", "Python");

		emp.add(m);
		emp.add(m1);
		emp.add(m2);

		LinkedHashMap<String, String> employee = emp.get(1);
		System.out.println(employee);
		System.out.println(employee.get("name"));

	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.oneWithoutHead();
		s.twoWithoutHead();
		s.oneWithHead();
		s.twoWithHead();

	}

}
