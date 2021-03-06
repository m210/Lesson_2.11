package com.example.Lesson_21.Service;

import com.example.Lesson_21.Basket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class MarketServiceImpl implements MarketService {

	private final Basket basket;
	public MarketServiceImpl(Basket basket) {
		this.basket = basket;
	}

	@Override
	public void add(List<Integer> ids) {
		basket.add(ids);
	}

	@Override
	public Set<Map.Entry<Integer, Integer>> get() {
		return basket.get();
	}

}
