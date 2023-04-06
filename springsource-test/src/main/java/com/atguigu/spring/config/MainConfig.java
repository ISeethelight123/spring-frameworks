package com.atguigu.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 这是一个配置类
 */

@ComponentScan("com.atguigu.spring")
@Configuration
public class MainConfig {

	public MainConfig(){
		System.out.println("MainConfig...创建了....");
	}

}


