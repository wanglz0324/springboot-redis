/**
 * Project Name:redis
 * File Name:User.java
 * Package Name:com.example.redis
 * Date:2017年7月8日下午1:11:45
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.redis.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 下午1:11:45 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 8848648408038920161L;
	private String id;
	private String info;
}
