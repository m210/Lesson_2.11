package com.example.Lesson_21;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BasketConfig {

    @Bean
    @SessionScope
    public Basket basket() {
        return new Basket();
    }
}
