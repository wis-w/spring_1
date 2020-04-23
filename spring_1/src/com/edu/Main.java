package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
		//ApplicationContext 代表IOC容器
		//ClassPathXmlApplicationContext  FileSystemXmlApplicationContext是IOC的实现
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml"); //表示在类路径下的配置文件
//		ApplicationContext ctx1 = new FileSystemXmlApplicationContext("D:/");//从文件系统中获取
		//2、从Ioc中获取bean实例
//		HelloWorld hello = (HelloWorld) ctx.getBean("helloWorld");// 通过id获取 id唯一
//		HelloWorld hello = ctx.getBean(HelloWorld.class);//利用类型返回IOC容器中的bean，但是要求IOC容器中智能有一个该类型的bean
//		
//		hello.say();
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("application.xml");
		Car car = ctx2.getBean(Car.class);
		System.out.println(car.toString());
	}

}
