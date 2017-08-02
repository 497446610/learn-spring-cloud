package com.dbuyer.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbuyer.springboot.properties.MyParams;

/**
 * 
 * @author 况小锋
 * @version 1.0 类说明: TODO
 */
@RestController
public class HelloController {

	@Autowired
	MyParams params;

	/**
	 * 
	 * @author 况小锋
	 * @return Hello world
	 */
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/myparams")
	public String myparams() {
		return "自定义参数：" + params.getWhoami() + "," + params.getAge() + "<br/>" + params.getDescrit();
	}

	@RequestMapping("/allparams")
	public String allparams() {
		return params.toString();
	}
}
