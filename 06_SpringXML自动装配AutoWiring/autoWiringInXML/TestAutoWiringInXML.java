package autoWiringInXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiringInXML {

	
	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("autoWiringInXML/beans.xml");
		UserService userService = (UserService)ac.getBean("service");
		userService.getUser();
	}
}
