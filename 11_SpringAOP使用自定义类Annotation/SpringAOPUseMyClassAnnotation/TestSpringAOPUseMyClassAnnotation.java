package SpringAOPUseMyClassAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOPUseMyClassAnnotation {

	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringAOPUseMyClassAnnotation/beans.xml");
		UserService userService = (UserService) ac.getBean("userService");
		userService.delete();
	}

}
