package javaDynamicUserService;

import org.junit.Test;

import javaDynamicProxy.RentHouse.ProxyInovationHandler;

public class UserServiceProxyTest {
	
	@Test
	public void test01(){

		//创建具体接口的实现类
		UserService userService = new UserServiceImpl();
		
		//设置代理对象，设置的是接口的具体实现类
		ProxyInovationHandler pih = new ProxyInovationHandler();
		pih.setTarget(userService);
		
		//获得对象，获得的是接口
		UserService proxy = (UserService)pih.getProxy();
		proxy.delete();
		
	}
}
