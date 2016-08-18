package springPropertyDI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringPropertyDI {

	@Test
	public  void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springPropertyDI/beans.xml");
	
		Student student = (Student)ac.getBean("student");
		User user1 = (User)ac.getBean("user1");
		User user2 = (User)ac.getBean("user2");
		
		
		System.out.println(student);
		student.show();
		System.out.println("--------------------------------------");
		System.out.println(user1);
		System.out.println("--------------------------------------");
		System.out.println(user2);
		System.out.println("--------------------------------------");
	}
	
}
