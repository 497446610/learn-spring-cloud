package com.dbuyer.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
public class MyCustomEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;

	private String msg;

	public MyCustomEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



}
