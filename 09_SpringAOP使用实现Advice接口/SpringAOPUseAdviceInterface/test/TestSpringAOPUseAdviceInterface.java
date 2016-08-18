package SpringAOPUseAdviceInterface.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringAOPUseAdviceInterface.service.UserService;

public class TestSpringAOPUseAdviceInterface {
	
	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringAOPUseAdviceInterface/test/beans.xml");
		UserService userService = (UserService) ac.getBean("userService");
		userService.update(2);
	}
}
