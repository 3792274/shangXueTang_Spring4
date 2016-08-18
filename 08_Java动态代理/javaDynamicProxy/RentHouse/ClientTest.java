package javaDynamicProxy.RentHouse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



//动态代理可以代理执行任何对象方法
public class ClientTest {
	
	@Test
	public void test01(){

		//		UserService userService = new UserServiceImpl();
//		ProxyInovationHandler pih = new ProxyInovationHandler();
//		pih.setTarget(userService);
//		UserService proxy = (UserService)pih.getProxy();
//		proxy.delete();
		
		
		//代理具体对象，返回的是接口
		ProxyInovationHandler ph1 = new ProxyInovationHandler();
		ph1.setTarget(new Host());
		Rent host = (Rent)ph1.getProxy();
		host.rent();
		
		System.out.println("----------------------------------");
		
		ProxyInovationHandler ph = new ProxyInovationHandler();
		ph.setTarget(new ArrayList());
		List list = (List)ph.getProxy();
		list.add(1);
	
	}
}
