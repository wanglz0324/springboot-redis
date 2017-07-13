/**
 * Project Name:redis
 * File Name:RedisController.java
 * Package Name:com.example.redis.controller
 * Date:2017年7月8日上午10:55:27
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:RedisController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午10:55:27 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@RestController
@RequestMapping("/redis/")
public class RedisController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping("index")
	@ResponseBody
	String index() {
		return "hello";
	}

	@RequestMapping("add")
	@ResponseBody
	String addUser() {
		stringRedisTemplate.opsForValue().set("abc", "123456");
		String val = stringRedisTemplate.opsForValue().get("abc");
		
		
		
		
		return val;
	}
}
