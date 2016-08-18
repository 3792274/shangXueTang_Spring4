package useSpringExample;


public class UserServicesImpl implements UserServices {
	
	private UserDao userdao = null;

	//Spring 需要一个set方法才能将需要的Userdao注入进来
   public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	
	@Override
	public void getUser() {
		userdao.getUser();
	}

}
