package com.dbuyer.springboot.aop;

import org.springframework.stereotype.Service;

/**
 * 说明: 使用自定义注解的service
 * @author 况小锋
 * @version 1.0
 */
@Service
public class DemoAnnotationService {

	@Action(name="注解拦截add的操作")
	public void add(){}
}
