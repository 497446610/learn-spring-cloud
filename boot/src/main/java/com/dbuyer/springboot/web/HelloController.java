package com.dbuyer.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbuyer.springboot.aop.DemoAnnotationService;
import com.dbuyer.springboot.aop.DemoMethodService;
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

	@Autowired
	DemoAnnotationService demoAnnotationService;

	@Autowired
	DemoMethodService demoMethodService;

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

	/**
	 * 
	 * 功能说明：测试AOP拦截
	 * 
	 * @author 况小锋
	 * @return 请查看控制台的输出。
	 */
	@RequestMapping("/aspect")
	public String aspect() {
		demoAnnotationService.add();
		demoMethodService.add();
		return "请查看控制台的输出。";
	}
	
	@RequestMapping("convert")
	public ControllerAjaxResult convert(){
		return  new ControllerAjaxResult("success","保存成功！",null);
	}

}
