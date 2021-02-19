package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/AutowireSpring.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(
				"Autowiring by Name: bean name address should be same as Employee class address instance variable if not then null :  ");
		System.out.println(emp);
	}

}

/**
 * Auto wiring by Name: bean name address should be same as Employee class
 * address instance variable then Employee [address=Address [street=GandhiNagar
 * chowk, city=Surat]] if not then null : Employee [address=null]
 **/

/**
 * Auto wiring by type: it will scan entire config file if it found same type
 * bean (same class type bean ) then it will automatically inject that bean ref
 * Employee [address=Address [street=GandhiNagar chowk, city=Surat]]
 * 
 * throws Exception if found more then one bean of same type :
 * 
 * No qualifying bean of type 'com.autowiring.Address' available: expected
 * single matching bean but found 2: address1,address2
 **/

/**
 * auto wiring by constructor : inside Employee Constructor: it will auto wire
 * through the constructor , bean name address should be same as Employee class
 * address instance variable then Employee [address=Address [street=GandhiNagar
 * chowk, city=Surat]]
 * 
 * it multiple bean of same type and different name then it throws exception
 * 
 **/