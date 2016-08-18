package myBeanFactory;

public class UserDynamicFactory {
	
	//指定Spring生成User对象所使用的工厂方法,有参数，需要配置
	public User newInstance(String name) {
		return new User(name);
	}
	
}
