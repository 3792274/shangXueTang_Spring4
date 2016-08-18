package useSpringExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseSpringExampleTest {

	@Test
	public void testUseSpringExample(){

		ApplicationContext ac = new ClassPathXmlApplicationContext("useSpringExample/bean.xml");
		UserServices us = (UserServices)ac.getBean("userServices");
		us.getUser();
	
	}
}
