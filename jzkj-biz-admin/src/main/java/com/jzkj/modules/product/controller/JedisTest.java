package com.jzkj.modules.product.controller;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

public class JedisTest {


    public static void main(String[] args) {
        while (true) {
            boolean resukt = true;
            Jedis jeis = new Jedis("127.0.0.1", 6379);
            String key = "limit-demo-000010";
            long afterValue = jeis.incr(key);
            if (afterValue == 1) {
                System.out.println("第一次");
                jeis.expire(key, 6000);

            } else {
                if (afterValue > 10) {
                    resukt = false;
                    return;
                }
            }
            System.out.println("限流结构：" + resukt);
        }
    }

}
