package autoWiringInXML;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = null;

	
	//bean.xml配置的构造器注入，无需set方法，无需空构造方法
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}

	//除构造器注入，其他注入需要提供空构造方法
	public UserServiceImpl() {
	}
	
	
	//byname,byType注入需要空构造方法及set方法
	public  void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
