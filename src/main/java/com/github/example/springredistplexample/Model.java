package com.github.example.springredistplexample;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.redis.core.RedisHash;

@Builder
@Value
@RedisHash
public class Model {
    String id;
    String data;
}
