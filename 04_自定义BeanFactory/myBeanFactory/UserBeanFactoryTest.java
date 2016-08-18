package myBeanFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanFactoryTest {

	private ApplicationContext ac;

	@Test
	public void test01() {
		ac = new ClassPathXmlApplicationContext("myBeanFactory/beans.xml");
		
		User user1 = (User) ac.getBean("user1"); //可以使用Bean.xml定义的别名
		User user2 = (User) ac.getBean("user1");
		
		
		user1.show();
		System.out.println(user1==user2);
	}
}
