package com.atguigu.spring.config;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map<String, Set<String>> map = new HashMap<>();
		Set<String> setA = new LinkedHashSet<String>();
		setA.add("a1");
		setA.add("a2");
		setA.add("a3");
		setA.add("a4");
		setA.add("a5");
		map.put("a",setA);
		Set<String> setB = new LinkedHashSet<String>();
		setB.add("b1");
		setB.add("b2");
		setB.add("b3");
		setB.add("b4");
		setB.add("b5");
		map.put("b",setB);

		String canonicalName = "a";

		Set<String> dependentBeans = map.computeIfAbsent(canonicalName, k -> new LinkedHashSet<>(8));

		System.out.println(dependentBeans);
	}


}
