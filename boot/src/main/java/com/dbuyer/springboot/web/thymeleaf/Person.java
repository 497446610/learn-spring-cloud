package com.dbuyer.springboot.web.thymeleaf;
/**
 * 说明: 功能描述
 * @author 况小锋
 * @version 1.0
 */
public class Person {
	private String name;
	private Integer age;
	
	public Person() {
		super();
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
