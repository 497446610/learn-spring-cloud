package com.dbuyer.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 说明: 获取application.properties中的自定义参数
 * 
 * @author 况小锋
 * @version 1.0
 */
@Component
public class MyParams {

	@Value("${biz.whoami}")
	private String whoami;

	@Value("${biz.age}")
	private String age;

	public String getWhoami() {
		return whoami;
	}

	public void setWhoami(String whoami) {
		this.whoami = whoami;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
