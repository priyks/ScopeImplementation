package bean.lifecycleInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPepsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean/lifecycleInterface/Spring.xml");
     context.registerShutdownHook();
     Pepsi p1=(Pepsi) context.getBean("pepsi");
     System.out.println(p1);
	}

}
/**
Setter 
Pepsi init ...
Pepsi [price=10]
Pepsi destroy...
**/