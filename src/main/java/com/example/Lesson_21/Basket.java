package com.example.Lesson_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

	private final List<Integer> items = new ArrayList<>();

	public void add(List<Integer> ids) {
		items.addAll(ids);
	}

	public List<Integer> get() {
		return Collections.unmodifiableList(items);
	}
	
}
