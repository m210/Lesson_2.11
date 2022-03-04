package com.example.Lesson_21.Controller;

import com.example.Lesson_21.Basket;
import com.example.Lesson_21.Service.MarketService;
import com.example.Lesson_21.Service.MarketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class MarketController {

    private final MarketService service;
    public MarketController(MarketService service) {
        this.service = service;
    }

    @GetMapping()
    public String main() {
        return "Test";
    }

    // http://localhost:8080/store/order/add?id=1,2,3,4
    @GetMapping("/add")
    public String add(@RequestParam List<Integer> id) {
        service.add(id);
        return "Added";
    }

    @GetMapping("/get")
    public Set<Map.Entry<Integer, Integer>> get() {
        return service.get();
    }
}
