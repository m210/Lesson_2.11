package com.example.Lesson_21;

import java.util.*;

public class Basket {

	private final Map<Integer, Integer> items = new HashMap<>();

	public void add(List<Integer> ids) {
		for(int i : ids) {
			int count = items.getOrDefault(i, 0);
			items.put(i, ++count);
		}
	}

	public Set<Map.Entry<Integer, Integer>> get() {
		return Collections.unmodifiableSet(items.entrySet());
	}
	
}
