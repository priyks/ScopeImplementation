package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype/sereotypeConfig.xml");
		  Student student=context.getBean("studentObj",Student.class);
		  System.out.println(student);
		  System.out.println(student.hashCode());
		  System.out.println(student.getPhoneNo());
		  System.out.println(student.getPhoneNo().getClass().getName());
		  
		  Student student2=context.getBean("studentObj",Student.class);
		  System.out.println(student2.hashCode()); // it will print the same hashcode bcz scope of bean is singleton
	}

}

/*
a "@Component" are considered
as candidates for auto-detectionwhen using annotation-based configuration and classpath scanning. 
we should define <context:component-scan base-package="com.stereotype"/> in config file to scan given package

will create an Object of @Componet class will default values;

then output:
Student [name=null, city=null]

when we use @Value Annotation on Properties then output
Student [name=Priyanka Kulkarni, city=Pune]

when can also specify name of Bean using @Component("studentObj")


prototype:

@Scope("prototype") it will give different object with each request 
output :
Student [name=Priyanka Kulkarni, city=Pune]
400103862
[9766357093, 9850481457, 8778146161]
java.util.Vector
573200870
*/