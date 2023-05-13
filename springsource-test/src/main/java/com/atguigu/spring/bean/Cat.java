package com.atguigu.spring.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//容器就应该给Cat再创建一个对象
//@Component
public class Cat implements InitializingBean {

	public Cat(){
		System.out.println("cat被创建了...");
	}

	private String name;


	@Value("${JAVA_HOME}") //自动赋值功能
	public void setName(String name) {
		System.out.println("cat....setName正在赋值调用....");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void init(){
		System.out.println("cat init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
