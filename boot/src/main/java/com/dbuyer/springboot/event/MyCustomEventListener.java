package com.dbuyer.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@Component
public class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

	@Override
	public void onApplicationEvent(MyCustomEvent event) {

		String msg = event.getMsg();
		System.out.println("------------>接收到我的自定义事件:" + msg);
	}

}
