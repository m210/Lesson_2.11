package com.example.Lesson_21.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MarketService {
	
	void add(List<Integer> ids);

	public Set<Map.Entry<Integer, Integer>> get();

}
