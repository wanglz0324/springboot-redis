package com.example.redis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.redis.po.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	StringRedisTemplate stringRedisTemplate1;

	@Autowired
	StringRedisTemplate stringRedisTemplate2;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void contextLoads() {

		final String key = "m101";
		stringRedisTemplate1.setEnableTransactionSupport(true);
		stringRedisTemplate2.setEnableTransactionSupport(true);
		stringRedisTemplate1.opsForValue().set(key, "111");
		DEL del1 = new DEL(stringRedisTemplate1);
		DEL del2 = new DEL(stringRedisTemplate2);

		ExecutorService es = Executors.newFixedThreadPool(14);
		es.execute(del1);
		es.execute(del2);
		// Assert.assertEquals("111",
		// stringRedisTemplate.opsForValue().get("aaa"));
	}

}
