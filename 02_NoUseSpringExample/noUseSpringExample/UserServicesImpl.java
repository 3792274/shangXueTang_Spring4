package noUseSpringExample;


public class UserServicesImpl implements UserServices {

	
	private UserDao userdao = null;

	//手动注入需要MySQL的实现 Or Oracle的实现
   public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	
	@Override
	public void getUser() {
		userdao.getUser();
	}

}
