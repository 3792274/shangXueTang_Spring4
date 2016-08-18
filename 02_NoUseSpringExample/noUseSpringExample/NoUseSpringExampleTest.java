package noUseSpringExample;

import org.junit.Test;

public class NoUseSpringExampleTest {

	@Test
	public void testNoUseSpringExample(){
		
		UserServicesImpl userServices  = new UserServicesImpl();
		
		userServices.setUserdao(new MySqlDaoImpl());  //执行Mysql的DAO
		userServices.getUser();
		
		System.out.println("--------------------------------------");
		userServices.setUserdao(new OracleDaoImpl()); //执行Oracle的DAO
		userServices.getUser();
		
	}
}
