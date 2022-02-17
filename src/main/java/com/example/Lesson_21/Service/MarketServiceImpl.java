package com.example.Lesson_21.Service;

import com.example.Lesson_21.Basket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Scope(scopeName = "prototype")
public class MarketServiceImpl implements MarketService {

	private final Basket basket;
	public MarketServiceImpl() {
		this.basket = new Basket();
	}

	@PostConstruct
	public void setup() {
		System.out.println("MarketServiceImpl is created");
	}

	@Override
	public void add(List<Integer> ids) {
		basket.add(ids);
	}

	@Override
	public List<Integer> get() {
		return basket.get();
	}

}
