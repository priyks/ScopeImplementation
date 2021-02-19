package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone/collection/standalone.xml");
     Person p=context.getBean("person",Person.class);
     System.out.println(p);
     System.out.println(p.getFriends().getClass().getName());
     System.out.println("--------------------");
     System.out.println(p.getFeeStructure());
     System.out.println(p.getFeeStructure().getClass().getName());
     System.out.println(p.getProperties());
     
     
	}

}
