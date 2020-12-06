package com.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
@ContextConfiguration
@SpringBootTest
class DemoApplicationTests {

    @Resource
    @Autowired
    public RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("name","jqf");
        System.out.println(redisTemplate.opsForValue().get("name"));

    }

}
