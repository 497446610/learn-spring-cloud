package com.dbuyer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * 说明: 主程序
 * 
 * @author 况小锋
 * @version 1.0
 *
 */
@SpringBootApplication
@ComponentScan("com.dbuyer")
public class SpringbootApplication {

	/**
	 * 
	 * 功能说明：启动应用
	 * 
	 * @author 况小锋
	 * @param args
	 *            动态参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
