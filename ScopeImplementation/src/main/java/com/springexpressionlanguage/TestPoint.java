package com.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springexpressionlanguage/ExpressionLanguageConfig.xml");
		 Point p=context.getBean("point", Point.class);
		 System.out.println(p);
	}

}
