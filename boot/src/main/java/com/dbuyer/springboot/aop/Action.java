package com.dbuyer.springboot.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 说明: 自定义AOP注解
 * 
 * @author 况小锋
 * @version 1.0
 */
@Target(ElementType.METHOD)
//1.RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
//2.RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
//3.RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使
@Retention(RetentionPolicy.RUNTIME)
@Documented // 加上此注解，生成javadoc时会包含到文档中，否则文档中不会包含相关注解的说明
public @interface Action {
	
	String name();

}
