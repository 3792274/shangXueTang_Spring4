package javaStaticProxy.UserService;


//UserService静态代理类
public class UserServiceProxy implements UserService {
	
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

	@Override
	public void add() {
		log("add");
		userService.add();
	}

	@Override
	public void delete() {
		// 日志，安全，缓存，事务，异常处理等
		log("delete");
		userService.delete();
	}

	@Override
	public void search() {
		log("search");
		userService.search();
	}

	public void update() {
		log("update");
		userService.update();
	}

	public void log(String methodName) {
		System.out.println("Log：执行" + methodName + "方法");
	}

}