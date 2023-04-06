package com.atguigu.spring;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import com.atguigu.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解版Spring的用法
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(MainConfig.class);
	}
}
