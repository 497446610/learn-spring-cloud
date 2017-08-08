package com.dbuyer.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbuyer.springboot.event.MyCustomEvent;

/**
 * 
 * @author 况小锋
 * @version 1.0 类说明: TODO
 */
@RestController
public class EventController {

	@Autowired
	ApplicationContext applicationContext;

	/**
	 * 
	 * @author 况小锋
	 * @return Hello world
	 */
	@RequestMapping("/myevent")
	public String index() {

		applicationContext.publishEvent(new MyCustomEvent(this, "测试发送自定义事件"));

		return "请查看控制台输出";
	}

}
