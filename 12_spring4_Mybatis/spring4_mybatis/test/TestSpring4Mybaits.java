package spring4_mybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring4_mybatis.dao.UserDao;

/**
 * 三种方式集成Mybatis
 */
public class TestSpring4Mybaits {
	
	
	@Test  //使用UserDaoImpl ,UserDAO 使用 SqlSessionTemplet
	public  void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4_mybatis/test/beans.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		System.out.println(userDao.selectUser().size());
	}
	
	
	@Test  //使用UserDaoImpl2  ,UserDAO 继承 SqlsessionDAOSupport
	public  void test02() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4_mybatis/test/beans.xml");
		UserDao userDao = (UserDao) context.getBean("userDao2");
		System.out.println(userDao.selectUser().size());
	}
	
	
	@Test  //使用UserDaoImpl3  ,使用UserMap 注解
	public  void test03() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4_mybatis/test/beans.xml");
		UserDao userDao = (UserDao) context.getBean("userDao3");
		System.out.println(userDao.selectUser().size());
	}
	
	
	
	
}
