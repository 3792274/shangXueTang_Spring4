package SpringAOPUseMyClass;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOPUseMyClass {
	
	
	@Test
	public   void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringAOPUseMyClass/beans.xml");
		UserService userService = (UserService) ac.getBean("userService");
		userService.delete();
	}
}
