package myBeanFactory;

public class User {
	
	private String name;
	
	//可以使用有参构造方法注入
	public User(String name) {
		super();
		this.name = name;
	}


	public void show(){
		System.out.println("name="+name);
	}
}
