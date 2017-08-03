package com.dbuyer.springboot.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 说明: AOP拦截
 * 
 * @author 况小锋
 * @version 1.0
 */
@Aspect
@Component
public class LogAspect {

	// 注解声明切点
	@Pointcut("@annotation(com.dbuyer.springboot.aop.Action)")
	public void annotationPointCut() {
	};

	@After(value = "annotationPointCut()")
	public void after(JoinPoint joinpoint) {
		MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截：" + action.name());
	}
	
	@Before("execution(* com.dbuyer.springboot.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinpoint){
		MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("方法规则式拦截：" + method.getName());
	}
}
