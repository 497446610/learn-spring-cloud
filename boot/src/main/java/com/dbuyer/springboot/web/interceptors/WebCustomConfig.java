package com.dbuyer.springboot.web.interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 自定义web相关的配置
 * 
 * @author 况小锋
 * @version 1.0
 */
@Configuration
public class WebCustomConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AppApiInterceptor()).addPathPatterns("/**");

	}
/*
	@Bean
	public HttpMessageConverters customConverters() {
		HttpMessageConverter<ControllerAjaxResult> additional = new UTF8ControllalAjaxResultHttpMessageConverter();
		UTF8StringHttpMessageConverter     additional2 = new UTF8StringHttpMessageConverter();
		return new HttpMessageConverters(additional,additional2);
	}*/

}
