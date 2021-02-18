package bean.lifecycleInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean/lifecycleInterface/Spring.xml");
	     context.registerShutdownHook();
	     Example exp=(Example)context.getBean("example");
	     System.out.println(exp);
	     
	}

}
