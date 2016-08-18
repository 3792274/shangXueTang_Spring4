package ssm.annotation.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssm.annotation.dao.UserService;
import ssm.annotation.vo.User;

 

public class TestSpring4Struts2MyBatis {

	@Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ssm/annotation/resources/applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		List<User> users = userService.getAll();
		System.out.println(users.size());
	}
}
