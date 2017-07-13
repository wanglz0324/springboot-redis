/**
 * Project Name:redis
 * File Name:DEL.java
 * Package Name:com.example.redis
 * Date:2017年7月8日下午1:24:55
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.redis;

import java.util.List;

import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * ClassName:DEL <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 下午1:24:55 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class DEL implements Runnable {
	private StringRedisTemplate stringRedisTemplate;

	public DEL(StringRedisTemplate stringRedisTemplate) {
		this.stringRedisTemplate = stringRedisTemplate;
	}

	public void run() {
		long b = System.currentTimeMillis();
		try {
			System.err.println(b);
			String key = "m101";
			// stringRedisTemplate.watch(key);
			stringRedisTemplate.multi();
			String val = stringRedisTemplate.opsForValue().get(key);
			List<Object> list = stringRedisTemplate.exec();
			if (list == null || list.isEmpty()) {
				System.out.println("null");
			}
			long e = System.currentTimeMillis();
			System.err.println(b + ":" + val + ":" + e);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(b + ":" + e.getMessage());
		}
	}

}
