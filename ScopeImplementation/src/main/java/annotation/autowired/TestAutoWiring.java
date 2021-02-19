package annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation/autowired/AutowiredAnnotation.xml");
		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(emp);
	}

}

/**
 * we can use @Autowired on Property of Employee class (address) 
 * we can use @Autowired on Constructor of Employee class
 * we can use @Autowired on Setter of Employee class which have address as parameter
 * 
 *
**/