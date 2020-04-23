package com.edu;
/**
 * @author  wyg_edu
 * @date  2020年4月23日
 * @version 1.0
 */
public class HelloWorld {
	
	private String name;
	
	public void say() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName2(String name) {
		System.out.println("开始赋值了");
		this.name = name;
	}
	

}
