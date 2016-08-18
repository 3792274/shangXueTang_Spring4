package javaStaticProxy.UserService;

import org.junit.Test;

public class TestJavaStaticProxy {

	@Test
	public void test01(){
		
		//提供具体实现类实例
		UserService userService = new UserServiceImpl();
		
		//将具体实现类实例，注入给代理类
		UserServiceProxy userServiceProxy = new UserServiceProxy();
		userServiceProxy.setUserService(userService);
		
		//调用代理类的方法既可以完成实现类的功能，也可以在代理类中添加更多的执行方法。
		userServiceProxy.add();
	}
	
}
