package com.github.example.springredistplexample;

import com.github.incu6us.redis.mock.EnableRedisMockTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableRedisMockTemplate
public class SpringRedisTplExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisTplExampleApplication.class, args);
    }
}

