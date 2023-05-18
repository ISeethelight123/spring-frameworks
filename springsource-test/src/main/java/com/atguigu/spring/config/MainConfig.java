package com.atguigu.spring.config;


import com.atguigu.spring.bean.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * 这是一个配置类
 */

@ComponentScan(basePackages = "com.atguigu.spring",basePackageClasses = {})
@Configuration
public class MainConfig {

	public MainConfig(){
		System.out.println("MainConfig...创建了....");
	}

}


