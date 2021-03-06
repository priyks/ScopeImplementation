package com.scopesingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * this class to test the scope of bean according scope type singleton and prototype
Singleton: Only one instance will be created for a single bean definition per Spring IoC container and the same 
object will be shared for each request made for that bean.
Prototype: A new instance will be created for a single bean definition every time a request is made for that bean.
 * @author priyankaku
 *
 */
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("com/scopesingleton/Spring.xml");
		  
		  Car bmw = (Car) context.getBean("car"); bmw.setName("BMW");
		  System.out.println("Car name of first Instance : " + bmw.getName());
		  
		  Car audi = (Car) context.getBean("car"); audi.setName("Audi");
		  System.out.println("Car name of second Instance : " + audi.getName());
		  
		  System.out.println("check car Instance :  " + (bmw == audi));
		  System.out.println("Address of First Instance : " + bmw);
		  System.out.println("Address of Second Instance : " + audi);
		  
		 
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/scopesingleton/Spring.xml");
		
		Car bmw = (Car) context.getBean("car");
		System.out.println(bmw.toString());
		context.registerShutdownHook();*/
		  
		  /*
		   * i practiced to implement life cycle methods of spring noticed that whenever 
		   * we use scope as prototype and wants to execute destroy method on bean it does not get called 
		   * even i registered context of abstractApplicationContext and up on context.registerShutdownHook()
		   *  and when i removed scope from bean definition destroy method get called ...
		   */
	}

}
