package com.edu;
/**
 * @author  wyg_edu
 * @date  2020年4月23日 下午9:36:52
 * @version 1.0
 */
public class Car {
	
	private String brand;
	private String corp;
	private int price;
	private int maxSpeed;
	
	
	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	

}
