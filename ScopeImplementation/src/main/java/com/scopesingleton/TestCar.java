package com.scopesingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/scopesingleton/Spring.xml");
      Car bmw=(Car)context.getBean("car");
      bmw.setName("BMW");
      System.out.println("Car name of first Instance : "+bmw.getName());
      
      Car audi=(Car)context.getBean("car");
      audi.setName("Audi");
      System.out.println("Car name of second Instance : "+audi.getName());
      
      System.out.println("check car Instance :  "+ (bmw==audi));
      System.out.println("Address of First Instance : "+bmw);
      System.out.println("Address of Second Instance : "+audi);
	}

}
