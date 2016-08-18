package dianCan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dianCan.dao.DetailDao;

public class TestDianCan {

	
	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("dianCan/resources/applicationContext.xml");
		DetailDao orderDao = (DetailDao)ac.getBean("detailDao");
		System.out.println(orderDao.listByOrderId(1).size());
}
}
