package hello_Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("hello_Spring/bean.xml");
		BeanFactory beanFactory =  new ClassPathXmlApplicationContext("hello_Spring/bean.xml");  //因为ClassPathXMLApplicationContext实现了BeanFactory接口
		
		
		Hello hello = beanFactory.getBean(Hello.class);
		hello.sayHello();

	}

}
