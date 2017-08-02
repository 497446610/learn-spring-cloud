package com.dbuyer.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 说明: 获取application.properties中的自定义参数
 * 
 * @author 况小锋
 * @version 1.0
 */
@Component
public class MyParams {

	//------ 自定义参数 --------------------//
	@Value("${biz.whoami}")
	private String whoami;

	@Value("${biz.age}")
	private String age;
	
	@Value("${biz.descrit}")
	private String descrit;
	
	//------ 随机值参数 --------------------//
	@Value("${biz.string}")
	private String str;
	
	@Value("${biz.int}")
	private String strint;
	
	@Value("${biz.long}")
	private String strlong;
	
	@Value("${biz.ten}")
	private String int10;
	
	@Value("${biz.twenty}")
	private String int10_20;
	

	public String getWhoami() {
		return whoami;
	}

	public void setWhoami(String whoami) {
		this.whoami = whoami;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescrit() {
		return descrit;
	}

	public void setDescrit(String descrit) {
		this.descrit = descrit;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStrint() {
		return strint;
	}

	public void setStrint(String strint) {
		this.strint = strint;
	}

	public String getStrlong() {
		return strlong;
	}

	public void setStrlong(String strlong) {
		this.strlong = strlong;
	}

	public String getInt10() {
		return int10;
	}

	public void setInt10(String int10) {
		this.int10 = int10;
	}

	public String getInt10_20() {
		return int10_20;
	}

	public void setInt10_20(String int10_20) {
		this.int10_20 = int10_20;
	}

	@Override
	public String toString() {
		return "MyParams [whoami=" + whoami + ", age=" + age + ", descrit=" + descrit + ", str=" + str + ", strint="
				+ strint + ", strlong=" + strlong + ", int10=" + int10 + ", int10_20=" + int10_20 + "]";
	}

	
	
}
