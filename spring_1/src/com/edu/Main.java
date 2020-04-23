package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author  wyg_edu
 * @date  2020年4月23日 下午8:53:16
 * @version 1.0
 */
public class Main {
	
	
	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("hello");
		
		//1、创建spring的ioc容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml"); //表示在类路径下的配置文件
		//2、从Ioc中获取bean实例
		HelloWorld hello = (HelloWorld) ctx.getBean("helloWorld");
		
		hello.say();
	}

}
