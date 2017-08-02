package com.dbuyer.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author 况小锋
 * @version 1.0  
 * 类说明: TODO
 */
@RestController
public class HelloController {
	
	/**
	 * 
	 * @author 况小锋 
	 * @return Hello world
	 */
	@RequestMapping("/hello")
	public String index(){
		return "Hello World";
	}
}
